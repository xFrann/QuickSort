package xyz.polarfrann.quicksort;

import java.util.Scanner;

public class InputHandler {

    Scanner inputScanner = new Scanner(System.in);

    public int scanSize() {
        return inputScanner.nextInt();
    }

    public int[] scanBetweenValues() {
        int[] betweenValues = new int[2];

        System.out.print("Minimum value: ");
        betweenValues[0] = inputScanner.nextInt();

        System.out.print("Maximum value: ");
        betweenValues[1] = inputScanner.nextInt();

        return betweenValues;
    }


}
