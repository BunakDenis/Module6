package global.goit.edu.hero;

public class AvgDamageCalculator {
    public int calculateAvg(int[] samples) {
        int sum = 0;
        for(int sampleValue: samples) {
            sum += sampleValue;
        }
        try {
            return sum / samples.length;
        } catch (ArithmeticException e) {
            return 0;
        }
    }
}
