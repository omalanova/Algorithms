import org.junit.Assert;
import org.junit.Test;

public class MultipleTest {
    @Test
    public void testMultiple() {
        String expectedResult1 = "Good Number";
        String expectedResult2 = "Bad Number";
        String expectedResult3 = "Poor Number";
        String expectedResult4 = "-1";
        Multiple multipleObj = new Multiple();
        String actualResult1 = multipleObj.multiple(15);
        String actualResult2 = multipleObj.multiple(9);
        String actualResult3 = multipleObj.multiple(25);
        String actualResult4 = multipleObj.multiple(1);
        Assert.assertEquals(expectedResult1, actualResult1);
        Assert.assertEquals(expectedResult2,actualResult2);
        Assert.assertEquals(expectedResult3,actualResult3);
        Assert.assertEquals(expectedResult4,actualResult4);
    }
}
