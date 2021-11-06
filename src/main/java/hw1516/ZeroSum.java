package hw1516;

public class ZeroSum {
        public int[] zeroSum (int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }
        int[] array_new = new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == 0) {
                    array_new[0] = array[j];
                    array_new[1] = array[i];
                }
            }
        }
        return array_new;
    }

//    public static void main(String[] args) {
//        massiv.ZeroSum zs = new massiv.ZeroSum();
//        int[] array_new = zs.zeroSum(new int[]{35, 23, 12, 89, -23, -48, 100});
//        System.out.println(Arrays.toString(array_new));
//    }
}
