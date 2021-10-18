import org.junit.Assert;
import org.junit.Test;

public class GetMaxTest {
    @Test
    public void testGetMax() {
        int expectedResult = 9999;
        GetMax getMaxObj = new GetMax();
        int actualResult = getMaxObj.getMax(3333, 9999);
        Assert.assertEquals(expectedResult, actualResult);
    }
}
