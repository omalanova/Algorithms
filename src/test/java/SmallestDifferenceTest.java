import org.junit.Assert;
import org.junit.Test;

public class SmallestDifferenceTest {
    @Test
    public void testSmallestDifference() {
        int[] expectedResult1 = {8, 8};
        int[] expectedResult2 = {-55, -54};
        int[] expectedResult3 = {};

        SmallestDifference smallestDifferenceObj = new SmallestDifference();

        int[] actualResult1 = smallestDifferenceObj.smallestDifference(new int[] {8, 5, 2, 0, 9, 12, 8});
        int[] actualResult2 = smallestDifferenceObj.smallestDifference(new int[] {8, -55, 2, -54, -12});
        int[] actualResult3 = smallestDifferenceObj.smallestDifference(new int[] {});

        Assert.assertArrayEquals("Test passed", expectedResult1, actualResult1);
        Assert.assertArrayEquals("Test passed", expectedResult2, actualResult2);
        Assert.assertArrayEquals("Test passed", expectedResult3, actualResult3);
    }
}
