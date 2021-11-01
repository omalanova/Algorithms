package hw1516;

import org.junit.Assert;
import org.junit.Test;

public class CompareSumTest {
    @Test
    public void testCompareSum() {
        boolean expectedResult1 = true;
        boolean expectedResult2 = false;

        CompareSum compareSumObj = new CompareSum();

        boolean actualResult1 = compareSumObj.compareSum(new int[] {4, 6, 3, 7, 1, 2});
        boolean actualResult2 = compareSumObj.compareSum(new int[] {12, 48, 15, 125});

        Assert.assertEquals("Test passed", expectedResult1, actualResult1);
        Assert.assertEquals("Test passed", expectedResult2, actualResult2);
    }
}
