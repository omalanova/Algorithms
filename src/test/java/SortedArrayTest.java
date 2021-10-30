import org.junit.Assert;
import org.junit.Test;

public class SortedArrayTest {
    @Test
    public void testSortedArray() {
        int[] expectedResult1 = {2, 3, 4, 5, 12};
        int[] expectedResult2 = {-39, -3, 0, 155, 1003};
        int[] expectedResult3 = {-5, -4, -3, -2, -1, 0};
        int[] expectedResult4 = {0, 0, 0, 1, 1, 1};

        SortedArray sortedArrayObj = new SortedArray();

        int[] actualResult1 = sortedArrayObj.sortedArray(new int[] {12, 2, 3, 4, 5});
        int[] actualResult2 = sortedArrayObj.sortedArray(new int[] {-3, 0, 155, -39, 1003});
        int[] actualResult3 = sortedArrayObj.sortedArray(new int[] {0, -1, -2, -3, -4, -5});
        int[] actualResult4 = sortedArrayObj.sortedArray(new int[] {0, 1, 0, 1, 0, 1});

        Assert.assertArrayEquals("Test passed", expectedResult1, actualResult1);
        Assert.assertArrayEquals("Test passed", expectedResult2, actualResult2);
        Assert.assertArrayEquals("Test passed", expectedResult3, actualResult3);
        Assert.assertArrayEquals("Test passed", expectedResult4, actualResult4);
    }
}
