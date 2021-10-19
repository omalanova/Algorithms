import java.util.Arrays;

public class StatArray {
    public int[] statArray (int[] array) {

        int max = array[0];
        int min = array[0];
        int sum = 0;
        int avg;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
            sum += array[i];

        }
        avg = (int) (sum / array.length);

        return new int[] {max, min, avg};
    }

    public static void main(String[] args) {
        StatArray arr1 = new StatArray();
        int[] arr2 = arr1.statArray(new int[]{1, 2, 3, 4, 5});
        System.out.println(Arrays.toString(arr2));
    }
}


