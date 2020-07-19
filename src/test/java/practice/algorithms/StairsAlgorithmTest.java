package practice.algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class StairsAlgorithmTest {

    @Test
    public void testAlgorithm() {
        StairsAlgorithm stairsAlgorithm = new StairsAlgorithm();

        int[] numOfSteps = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] limitations = {1, 3, 5};

        int[] actualResult = new int[0];
        try {
            actualResult = stairsAlgorithm.getNumberOfWays(numOfSteps, limitations);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }

        int[] expectedResult = {1, 1, 1, 2, 3, 5, 8, 12, 19, 30, 47};
        assertNotNull(actualResult);
        for (int i = 0; i < actualResult.length; i++) {
            assertEquals(expectedResult[i], actualResult[i]);
        }

        stairsAlgorithm.printNumberOfWays(actualResult, limitations);
    }
}

