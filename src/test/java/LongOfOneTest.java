import org.junit.Assert;
import org.junit.Test;

public class LongOfOneTest {
    @Test
    public void testLongOfOneTest() {
        int[] expectedResult1 = {1, 1, 1};
        int[] expectedResult2 = {1, 1};
        int[] expectedResult3 = {1, 1, 1, 1, 1};

        LongOfOne longOfOneObj = new LongOfOne();

        int[] actualResult1 = longOfOneObj.longOfOne(new int[] {1, 1, 1, 0, 0, 0, 1, 1});
        int[] actualResult2 = longOfOneObj.longOfOne(new int[] {1, 0, 1, 1, 0, 1});
        int[] actualResult3 = longOfOneObj.longOfOne(new int[] {1, 0, 1, 1, 0, 1, 1, 1, 1, 1});

        Assert.assertArrayEquals("Test passed", expectedResult1, actualResult1);
        Assert.assertArrayEquals("Test passed", expectedResult2, actualResult2);
        Assert.assertArrayEquals("Test passed", expectedResult3, actualResult3);
    }
}
