import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class RemoveDuplicatesTest {
    @Test
    public void testRemoveDuplicates() {
//        int[] arr = new int[]{3, 4, 2, 6};
//        int[] expectedResult1 = Arrays.sort(arr);
        int[] expectedResult2 = {0, 1, 2, 3, 4, 5};
        int[] expectedResult3 = {1, 2, 9, 8};

        RemoveDuplicates removeDuplicatesObj = new RemoveDuplicates();

        //int[] actualResult1 = removeDuplicatesObj.justUniques(new int[]{3, 4, 2, 6, 4, 3, 3, 3, 2, 2});
        int[] actualResult2 = removeDuplicatesObj.justUniques(new int[] {0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0});
        int[] actualResult3 = removeDuplicatesObj.arrayOrigin(new int[] {1, 1, 2, 2, 9, 9, 9, 8, 8});
        //Assert.assertArrayEquals("Test passed", expectedResult1, actualResult1);
        Assert.assertArrayEquals("Test passed", expectedResult2, actualResult2);
        Assert.assertArrayEquals("Test passed", expectedResult3, actualResult3);
    }
}
