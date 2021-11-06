package hw1516;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] array, int targetNumber) {
        if (array == null || array.length == 0) {
            return array;
        }
        int[] array_new = new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] + array[j] == targetNumber) {
                    array_new[0] = j;
                    array_new[1] = i;
                } else if (i == j && array[i] + array[j] == targetNumber) {
                    array_new[0] = 1000000;
                    array_new[1] = 1000000;
                }
            }
        }
        return array_new;
    }

        public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] array_new = ts.twoSum2(new int[] {68, 5, 2, 100, 9, 12, 7}, 10);
        System.out.println(Arrays.toString(array_new));

    }
    public int[] twoSum2(int[] array, int targetNumber) {
        if (array != null) {

            for (int i = 0; i < array.length - 1; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] + array[j] == targetNumber) {
                        return new int[]{i, j};
                    }
                }
            }

        }
        return new int[1];
    }
}