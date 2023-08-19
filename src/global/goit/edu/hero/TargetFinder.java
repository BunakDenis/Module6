package global.goit.edu.hero;

import java.util.Arrays;

public class TargetFinder {

    private int[] aiCoords;
    private int[][] targets;

    public int[] findTarget(int[] aiCoords, int[][] targets) {
        int[] target = new int[2];
        int distanceAI = 0;
        int minValue = findMinValue(aiCoords, targets);
        for (int i = 0; i < targets.length; i++) {
            for (int j = 0; j < 1; j++) {
                int differenceOfCoord = (int) Math.pow((aiCoords[j] - targets[i][j]), 2) + (int) Math.pow((aiCoords[j + 1] - targets[i][j + 1]), 2);
                distanceAI = (int) Math.sqrt(differenceOfCoord);
            }
            if (minValue == distanceAI) {
                target[0] = targets[i][0];
                target[1] = targets[i][1];
            }
        }
        return target;
    }
    private int findMinValue(int[] aiCoords, int[][] targets) {
        int[] maxValues = new int[targets.length];
        int distanceMin = 0;
        int distanceAI = 0;
        for (int i = 0; i < targets.length; i++) {
            for (int j = 0; j < 1; j++) {
                int differenceOfCoord = (int) Math.pow((aiCoords[j] - targets[i][j]), 2) + (int) Math.pow((aiCoords[j + 1] - targets[i][j + 1]), 2);
                distanceAI = (int) Math.sqrt(differenceOfCoord);
                maxValues[i] = distanceAI;
            }
        }
        distanceMin = maxValues[0];

        for (int values: maxValues) {
            if (distanceMin > values){
                distanceMin = values;
            }
        }
        return distanceMin;
    }
}

class TargetFinderTest {
    public static void main(String[] args) {
        int[] aiCoords = {10, 10};
        int[][] targets = {
                {20, 20},
                {15, 14},
                {30, 5}
        };

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

        //Expect [15, 14]
        System.out.println(Arrays.toString(nearestTarget));
    }
}
