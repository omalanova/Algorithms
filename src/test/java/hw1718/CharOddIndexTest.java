package hw1718;

import org.junit.Assert;
import org.junit.Test;

public class CharOddIndexTest {
    @Test
    public void testCharOddIndex () {
        String expectedResult1 = "AoEeyn";
        String expectedResult2 = "aaesnAeu";

        CharOddIndex CharOddIndexObj = new CharOddIndex();

        String actualResult1 = CharOddIndexObj.outputCharOddIndex("QAForEveryone");
        String actualResult2 = CharOddIndexObj.outputCharOddIndex("JavaLessonsAreFun");

        Assert.assertEquals(expectedResult1, actualResult1);
        Assert.assertEquals(expectedResult2, actualResult2);
    }
}
