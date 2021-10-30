import java.util.Arrays;

public class SortedArray {
    public int[] sortedArray (int[] array) {
        if (array == null) {
            return array;
        }
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }

            }
        }
        return array;
    }

//    public static void main(String[] args) {
//        SortedArray sa = new SortedArray();
//        int[] array_new = sa.sortedArray(new int[]{-3, 0, 155, -39, 1003});
//        System.out.println(Arrays.toString(array_new));
//    }
}
