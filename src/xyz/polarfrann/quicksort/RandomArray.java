package xyz.polarfrann.quicksort;

import java.util.Random;

public class RandomArray {

    Random random = new Random();

    //Creates a new random array
    //@param size - it determine the size of the random array
    public int[] create(int size) {
        int[] randomArray = new int[size];



        //Fills the array with random integers
        for (int i = 0; i < size; i++) {
            randomArray[i] = random.nextInt();
        }

        return randomArray;
    }

    //Creates a new random array between two values
    //@param size - the size of the random created array
    //@param min - the minimum value of the integers inside the array
    //@param max - the maximum value of the integers inside the array
    public int[] createBetween(int size, int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("The max parameter should be bigger than the minimum one");
        }

        int[] randomArray = new int[size];
        //Fills the array with random integers between max, min values
        //max and min values are inclusive
        for (int i = 0; i < size; i++) {
            randomArray[i] = random.nextInt((max - min) + 1) + min;
        }


        return randomArray;
    }
}
