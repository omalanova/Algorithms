import java.util.Arrays;

public class LongOfOne {
    public int[] longOfOne (int[] array) {
        if (array == null) {
            return array;
        }
        int max_count = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count++;
            } else if (count > max_count) {
                max_count = count;
                count = 0;
            }
            if (i == array.length - 1) {
                if (count > max_count) {
                    max_count = count;
                    count = 0;
                }
            }
        }
        int[] array_new = new int[max_count];
        for (int i = 0; i < max_count; i++) {
            array_new[i] = 1;
        }
        return array_new;
    }

    public static void main(String[] args) {
        LongOfOne lo = new LongOfOne();
        int[] arr = lo.longOfOne(new int[]{1, 1, 0, 0, 0, 1, 1, 1, 1});
        System.out.println(Arrays.toString(arr));
    }
}
