package module1.practice;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by citsym on 02.12.16.
 */
public class BubbleSortTest {

    @Test
    public void testSort() throws Exception {
        // Prepare data
        int[] testArray = new int[] {10, 5, 3, 56, 6, 7};

        // Evaluate code
        int[] actualResult = BubbleSort.sort(testArray);

        // Check the result

        int[] expectedResult = new int[] {3, 5, 6, 7, 10, 56};

        Assert.assertArrayEquals(expectedResult, actualResult);

    }
}