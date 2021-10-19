import org.junit.Assert;
import org.junit.Test;

public class OddEvenTest {
    @Test
    public void testOddEven() {

        String expectedResult1 = "Odd";
        String expectedResult2 = "Even";
        String expectedResult3 = "Undefined";

        OddEven oddEvenObj = new OddEven();

        String actualResult1 = oddEvenObj.oddEven(-345);
        Assert.assertEquals(expectedResult1, actualResult1);

        String actualResult2 = oddEvenObj.oddEven(0);
        Assert.assertEquals(expectedResult2, actualResult2);

        String actualResult3 = oddEvenObj.oddEven(222222);
        Assert.assertEquals(expectedResult2, actualResult3);

        String actualResult4 = oddEvenObj.oddEven(2147483647 + 1);
        Assert.assertEquals(expectedResult3, actualResult4);
    }
}
