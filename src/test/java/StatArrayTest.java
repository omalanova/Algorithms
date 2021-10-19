import org.junit.Assert;
import org.junit.Test;

public class StatArrayTest {
    @Test
    public void testStatArray() {
        int[] expectedResult1 = {5, 1, 3};
        int[] expectedResult2 = {1003, -39, 223};

        StatArray statArrayObj = new StatArray();

        int[] actualResult1 = statArrayObj.statArray(new int[] {1, 2, 3, 4, 5});
        int[] actualResult2 = statArrayObj.statArray(new int[] {-3, 0, 155, -39, 1003});

        Assert.assertArrayEquals(expectedResult1, actualResult1);
        Assert.assertArrayEquals(expectedResult2, actualResult2);


    }
}
