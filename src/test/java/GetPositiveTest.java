import org.junit.Assert;
import org.junit.Test;

public class GetPositiveTest {
    @Test
    public void testGetPositive() {
        boolean expectedResult1 = true;
        boolean expectedResult2 = false;
        GetPositive getPositiveObj = new GetPositive();
        boolean actualResult1 = getPositiveObj.getPositive(555);
        boolean actualResult2 = getPositiveObj.getPositive(0);
        boolean actualResult3 = getPositiveObj.getPositive(-555);
        Assert.assertEquals(expectedResult1, actualResult1);
        Assert.assertEquals(expectedResult1,actualResult2);
        Assert.assertEquals(expectedResult2,actualResult3);
    }
}
