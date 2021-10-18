import org.junit.Assert;
import org.junit.Test;

public class AscendingSequenceTest {
    @Test
    public void testAscendingSequence() {
        int[] expectedResult1 = {-1};
        int[] expectedResult2 = {10, 15, 20, 25};

        AscendingSequence ascendingSequenceObj = new AscendingSequence();

        int[] actualResult1 = ascendingSequenceObj.ascendingSequence(10, 25, 5);
        Assert.assertArrayEquals("Test passed", expectedResult2, actualResult1);

        int[] actualResult2 = ascendingSequenceObj.ascendingSequence(10, -25, -5);
        Assert.assertArrayEquals("Test passed", expectedResult1, actualResult2);

        int[] actualResult3 = ascendingSequenceObj.ascendingSequence(10, 10, 2);
        Assert.assertArrayEquals("Test passed", expectedResult1, actualResult3);
    }
}
