package xyz.polarfrann.quicksort;

import java.util.Scanner;

public class InputHandler {

    private Scanner inputScanner = new Scanner(System.in);

    public int scanSize() {
        return inputScanner.nextInt();
    }

    public int getMinimumValue() {
        System.out.print("Minimum value: ");
        return inputScanner.nextInt();
    }

    public int getMaximumValue() {
        System.out.println("Maximum value: ");
        return inputScanner.nextInt();
    }

    public boolean showElapsedTime() {
        boolean showTime = true;
        String choice = inputScanner.next();
        if (choice.startsWith("f") || choice.startsWith("0")) {
            showTime = false;
        }
        return showTime;
    }


}
