package org.JavaAssignment;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        shuffleArrayFn(array);
        System.out.println("Shuffled Array: " + Arrays.toString(array));
    }

    private static void shuffleArrayFn(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {                 //itteration through array
            int j = random.nextInt(i+1);                  //generating random number in range of current index
            int temp = array[i];                                //swapping the current value to random value
            array[i] = array[j];
            array[j] = temp;
        }
    }
}





//1. Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.
//        2. Enter a Roman Number as input and convert it to an integer. (Example: IX = 9)
//        3. Check if the input is pangram or not. (A pangram is a sentence that contains all the
//        alphabets from A to Z)