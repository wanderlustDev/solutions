package practice.algorithms;

import java.util.Arrays;

public class StairsAlgorithm {

    public int[] getNumberOfWays(int[] numOfSteps, int[] limitations) throws Exception {
        if (limitations.length > 0) {
            final int[] numOfWays = new int[numOfSteps.length];
            numOfWays[0] = 1;
            for (int i = 1; i < numOfSteps.length; i++) {
                int totalNumOfWays = 0;
                for (int j : limitations) {
                    if (i >= j) {
                        totalNumOfWays = totalNumOfWays + numOfWays[i-j];
                    } else {
                        break;
                    }
                }
                numOfWays[i] = totalNumOfWays;
            }
            return numOfWays;
        } else {
            throw new Exception("Limitations required");
        }
    }

    public void printNumberOfWays(int[] numOfWays, int[] limitations) {
        for (int i = 0; i < numOfWays.length; i++) {
            System.out.println("When there are " + i + " steps, with limitations " + Arrays.toString(limitations)
                    + ", there are " + numOfWays[i] + " ways to climb");
        }
    }
}
