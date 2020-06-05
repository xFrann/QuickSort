package xyz.polarfrann.quicksort;


public class Main {


    public static void main(String[] args) {

        Quicksort qs = new Quicksort();

        //Create a random array to be sorted
        int[] arrayToSort = new RandomArray().createBetween(10000, 1, 1000);

        //Start the timer for the duration of sorting the elements
        long start = System.currentTimeMillis();
        ElapsedTimeCalculator timeCalculator = new ElapsedTimeCalculator(start);

        //Sort the array and show the results
        qs.quickSort(arrayToSort, 0, arrayToSort.length - 1);
        qs.showResult(arrayToSort, timeCalculator.calculateElapsedTime());

    }

}
