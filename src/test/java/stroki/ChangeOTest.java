package stroki;

import org.junit.Assert;
import org.junit.Test;

public class ChangeOTest {
    @Test
    public void testChangeO () {
        String expectedResult1 = "QAForEveryone";
        String expectedResult2 = "Java lessons are fun";
        String expectedResult5 = "QAForEveryoneoooo1o";

        ChangeO ChangeOObj = new ChangeO();

        String actualResult1 = ChangeOObj.outputChangeO("QAF0rEvery0ne");
        String actualResult2 = ChangeOObj.outputChangeO("Java less0ns are fun");

//        String actualResult3 = ChangeOObj.outChangeO("QAF0rEvery0ne");
//        String actualResult4 = ChangeOObj.outChangeO("Java less0ns are fun");
//        String actualResult5 = ChangeOObj.outChangeO("QAF0rEvery0ne000010");

        Assert.assertEquals(expectedResult1, actualResult1);
        Assert.assertEquals(expectedResult2, actualResult2);
//        Assert.assertEquals(expectedResult1, actualResult3);
//        Assert.assertEquals(expectedResult2, actualResult4);
//        Assert.assertEquals(expectedResult5, actualResult5);
    }
}
