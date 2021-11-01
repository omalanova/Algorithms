package hw1516;

import org.junit.Assert;
import org.junit.Test;

public class CompareArraysTest {
    @Test
    public void testCompareArrays() {
        boolean expectedResult1 = true;
        boolean expectedResult2 = false;

        CompareArrays compareArraysObj = new CompareArrays();

        boolean actualResult1 = compareArraysObj.compareArrays(new int[] {1, 2, 3, 4, 5}, new int[] {1, 2, 3, 4, 5});
        boolean actualResult2 = compareArraysObj.compareArrays(new int[] {1, 2, 3, 4, 6}, new int[] {1, 2, 3, 4, 5});

        Assert.assertEquals("Test passed", expectedResult1, actualResult1);
        Assert.assertEquals("Test passed", expectedResult2, actualResult2);
    }
}
