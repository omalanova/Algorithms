import org.junit.Assert;
import org.junit.Test;

public class ValuesOfOddIndexesTest {
    @Test
    public void testValuesOfOdd() {
        int[] expectedResult = {590, 985, 68};

        ValueOfOddIndexes valueOfOddIndexesObj = new ValueOfOddIndexes();

        int[] actualResult = valueOfOddIndexesObj.valueOfOdd(new int[] {-45, 590, 234, 985, 12, 68});
        Assert.assertArrayEquals("Test passed", expectedResult, actualResult);


    }
}
