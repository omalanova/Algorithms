import org.junit.Assert;
import org.junit.Test;

public class GetSumTest {
    @Test
    public void testGetSum() {
        GetSum getSumObj = new GetSum();

        int expectedResult1 = 24753;
        int actualResult1 = getSumObj.getSum(222);

        int expectedResult2 = 56;
        int actualResult2 = getSumObj.getSum(-10);

        Assert.assertEquals("Test passed", expectedResult1, actualResult1);
        Assert.assertEquals("Test passed", expectedResult2, actualResult2);

    }
}
