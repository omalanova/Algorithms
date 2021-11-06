package hw1516;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {
    @Test
    public void testTwoSum() {
        int[] expectedResult1 = {2, 6};
        int[] expectedResult2 = {0, 5};
        int[] expectedResult3 = {3, 5};
        int[] expectedResult4 = {1000000, 1000000};

        TwoSum twoSumObj = new TwoSum();

        int[] actualResult1 = twoSumObj.twoSum(new int[] {68, 5, 2, 100, 9, 12, 8}, 10);
        int[] actualResult2 = twoSumObj.twoSum(new int[] {1, 20, 40, 60, -40, -20, -1}, -19);
        int[] actualResult3 = twoSumObj.twoSum(new int[] {8, 5, 2, 0, 9, 12, 8}, 12);
        int[] actualResult4 = twoSumObj.twoSum(new int[] {68, 5, 2, 100, 9, 12, 7}, 10);

        Assert.assertArrayEquals("Test passed", expectedResult1, actualResult1);
        Assert.assertArrayEquals("Test passed", expectedResult2, actualResult2);
        Assert.assertArrayEquals("Test passed", expectedResult3, actualResult3);
        Assert.assertArrayEquals("Test passed", expectedResult4, actualResult4);
    }
}
