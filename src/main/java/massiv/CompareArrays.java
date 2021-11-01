package massiv;

import java.util.Arrays;

public class CompareArrays {
    public boolean compareArrays(int[] array1, int[] array2) {
        if (array1 == null || array1.length == 0 || array2 == null || array2.length == 0) {
            return false;
        }
        return  (Arrays.equals(array1, array2));
    }

    public static void main(String[] args) {
        CompareArrays ca = new CompareArrays();
        boolean ca1 = ca.compareArrays(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5});
        System.out.println(ca1);
    }
}
