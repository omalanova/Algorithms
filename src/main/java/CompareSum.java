public class CompareSum {
    public boolean compareSum (int[] array) {
        if (array == null || array.length == 0 || array.length % 2 != 0) {
            return false;
        }

        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array.length / 2; i++) {
            sum1 += array[i];
        }
        for (int i = array.length / 2; i < array.length; i++) {
            sum2 += array[i];
        }

        return (sum1 > sum2);
    }

//    public static void main(String[] args) {
//        CompareSum cs = new CompareSum();
//        boolean cs1 = cs.compareSum(new int[]{12, 48, 15, 125});
//        System.out.println(cs1);
//    }
}
