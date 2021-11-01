package hw1314;

import java.util.Arrays;

public class AscendingSequence {
    public int[] ascendingSequence (int a, int b, int n) {
        int len = (b - a) / n + 1;
        int[] array = new int[len];
        if (a >= b) {
            array = new int[] {-1};
            System.out.println(Arrays.toString(array));
        } else {
            for (int i = 0; i < len; i++) {
                array[i] = a;
                a += n;
                System.out.print(array[i] + " ");
            }
        } return array;
    }

    public static void main(String[] args) {
        AscendingSequence arr1 = new AscendingSequence();
        arr1.ascendingSequence(10, 25, 5);
        System.out.println();

        AscendingSequence arr2 = new AscendingSequence();
        arr2.ascendingSequence(10, 10, 2);
        System.out.println();

        AscendingSequence arr3 = new AscendingSequence();
        arr3.ascendingSequence(10, -25, -5);

    }


}
