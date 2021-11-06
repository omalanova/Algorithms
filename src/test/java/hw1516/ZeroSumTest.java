package hw1516;

import org.junit.Assert;
import org.junit.Test;

public class ZeroSumTest {
    @Test
    public void testZeroSum() {
        int[] expectedResult1 = {23, -23};
        int[] expectedResult2 = {0, 0};

        ZeroSum zeroSumObj = new ZeroSum();

        int[] actualResult1 = zeroSumObj.zeroSum(new int[] {35, 23, 12, 89, -23, -48, 100});
        int[] actualResult2 = zeroSumObj.zeroSum(new int[] {0, 0, 0, 0});

        Assert.assertArrayEquals("Test passed", expectedResult1, actualResult1);
        Assert.assertArrayEquals("Test passed", expectedResult2, actualResult2);
    }
}
