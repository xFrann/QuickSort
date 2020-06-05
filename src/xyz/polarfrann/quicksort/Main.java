package xyz.polarfrann.quicksort;


public class Main {

    public static void main(String[] args) {

        Quicksort qs = new Quicksort();

        //Create a random array to be sorted
        int[] arrayToSort = new RandomArray().createBetween(50, 1, 100);
        qs.quickSort(arrayToSort, 0, arrayToSort.length - 1);
        qs.showResult(arrayToSort);
    }

}
