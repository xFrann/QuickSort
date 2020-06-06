package xyz.polarfrann.quicksort;


public class Main {

    public static final int STARTING_INDEX = 0;

    public static void main(String[] args) {

        Quicksort qs = new Quicksort();

        InputHandler input = new InputHandler();

        System.out.print("How many integers should the array contain?: ");
        int size = input.scanSize();


        System.out.println("Please insert the minimum and maximum values of the integers: ");

        int min = input.getMinimumValue();
        int max = input.getMaximumValue();


        //Create a random array to be sorted
        int[] arrayToSort = new RandomArray().createBetween(size, min, max);

        System.out.print("Do you want to visualize the sorting time duration of the algorithm?: ");
        if (input.showElapsedTime()) {

            //Start the timer for the duration of sorting the elements
            long start = System.currentTimeMillis();

            //Sort the array
            qs.quickSort(arrayToSort, STARTING_INDEX, arrayToSort.length - 1);

            //Stop the timer and show the result
            ElapsedTimeCalculator timeCalculator = new ElapsedTimeCalculator(start);
            qs.showResult(arrayToSort, timeCalculator.calculateElapsedTime());

        } else {

            //Sort the array && Show the result
            qs.quickSort(arrayToSort, STARTING_INDEX, arrayToSort.length - 1);

            qs.showResult(arrayToSort);

        }
    }

}
