package xyz.polarfrann.quicksort;

public class Quicksort {


    //All sorting logic inside this method
    //@param big - hold the value of the last element in the array, the pivot
    //@param small - variable that holds a element smaller than the pivot
    public void quickSort(int[] array, int small, int big) {

    }

    //This method will print the sorted array and
    //the time that it took to sort it.
    private void showResult(int[] array) {
        System.out.println("Elements sorted in just: " + " ms");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
