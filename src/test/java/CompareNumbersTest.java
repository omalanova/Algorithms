import org.junit.Assert;
import org.junit.Test;

public class CompareNumbersTest {
    @Test
    public void testCompareNumbers() {
        int expectedResult1 = 0;
        int expectedResult2 = -1;
        int expectedResult3 = 1;
        CompareNumbers compareNumbersObj = new CompareNumbers();
        int actualResult1 = compareNumbersObj.compareNumbers(89, 89);
        int actualResult2 = compareNumbersObj.compareNumbers(-89, 89);
        int actualResult3 = compareNumbersObj.compareNumbers(89, -89);
        Assert.assertEquals(expectedResult1, actualResult1);
        Assert.assertEquals(expectedResult2,actualResult2);
        Assert.assertEquals(expectedResult3,actualResult3);
    }
}
