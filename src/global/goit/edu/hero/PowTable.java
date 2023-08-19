package global.goit.edu.hero;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PowTable {

    public static final int[] POWERS_2 = new int[10];

    static {
        int number = 1;
        for (int i = 0; i < POWERS_2.length; i++) {
            POWERS_2[i] = (int) Math.pow(number, 2);
            number++;
        }
    }



    public static void main(String[] args) {
        System.out.println(Arrays.toString(PowTable.POWERS_2));
    }
}
