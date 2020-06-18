package lotto.step2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class RandomGenerator {

    public static int[][] generateRandomNumberOfArraysOfArray(int amountOfArraysofArrays, int amountOfNumbersOfArraysOfArrays, int maxRangeOfNumber) {
        int[][] randomNumbersOfArraysOfArrays = new int[amountOfArraysofArrays][];
        for(int j =0; j< amountOfArraysofArrays; j++ ) {
            randomNumbersOfArraysOfArrays[j] = generateSortedRandomNumbersOfArray(amountOfNumbersOfArraysOfArrays,maxRangeOfNumber);
        }
        return randomNumbersOfArraysOfArrays;
    }

    public static int[] generateSortedRandomNumbersOfArray(int amount, int maxRange){
        int[] randomNumbersOfArray = new int[amount];
        for(int i=1; i<=amount; i++) {
            randomNumbersOfArray[i] = new Random().nextInt(maxRange);
        }
        Arrays.sort(randomNumbersOfArray);
        return randomNumbersOfArray;
    }


}