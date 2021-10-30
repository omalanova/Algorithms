import java.util.Arrays;

public class SmallestDifference {
    public int[] smallestDifference (int[] array) {
        if (array == null) {
            return array;
        }
        int[] array_new = new int[2];
        int min = Math.abs(array[0] - array[1]);
        int number_i = 0;
        int number_j = 1;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (Math.abs(array[i] - array[j]) < min) {
                    min = Math.abs(array[i] - array[j]);
                    number_i = i;
                    number_j = j;
                }
            }
        }
        array_new[0] = array[number_i];
        array_new[1] = array[number_j];
        return array_new;
    }
    public static void main(String[] args) {
        SmallestDifference sd = new SmallestDifference();
        int[] array_new = sd.smallestDifference(new int[]{});
        System.out.println(Arrays.toString(array_new));
    }
}
