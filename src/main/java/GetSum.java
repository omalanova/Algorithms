public class GetSum {
    public int getSum(int n) {
        int sum;
        if (n > 0) {
            sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
        } else {
            sum = 1;
            for (int i = -1; i >= n; i--) {
                sum -= i;
            }
        } return sum;
    }

}
