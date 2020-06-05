package xyz.polarfrann.quicksort;

public class Quicksort {


    //All sorting logic inside this method
    //@param bigIndex - hold the value of the last element in the array, the pivot
    //@param smallIndex - variable that holds the smallest element of the array
    public void quickSort(int[] array, int smallIndex, int bigIndex) {
        if (smallIndex < bigIndex) {
            int pos = fixPosition(array, smallIndex, bigIndex);
            quickSort(array, smallIndex, pos - 1);
            quickSort(array, pos + 1, bigIndex);
        }
    }
    //Sorts the elements inside the array by the pivot position
    //Elements smaller than the pivot will go on the left part of the array(they swap with the big ones)
    //leaving the bigger elements on the right side of the array
    //It also fixes the position of the pivot inside the arrays
    //Parameters are the same as the quicksort method params
    //@return - returns the sorted index of the pivot after swap.
    private int fixPosition(int[] array, int small, int big) {
        int pivot = array[big];
        int j = small - 1;
        //Placed the current smallest element out of bounds
        //So smallest number can start at index 0 at iteration
        for (int i = small; i < big; i++) {
            if (array[i] < pivot) {
                j++;
                swapElements(array, i, j);
            }
        }
        //this is the swap that fixes the pivot position correctly.
        swapElements(array, j + 1, big);
        return j + 1;
    }
    //Swaps two elements in a given array
    private void swapElements(int[] array, int firstIndex, int secondIndex) {
        //Holds the value of one of the elements inside a temporary variable
        int tempElement = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = tempElement;
    }

    //This method will print the sorted array and
    //the time that it took to sort it.
    public void showResult(int[] array, long time) {
        System.out.println("Elements sorted in just: " + time + " ms");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
    //This will just print the array without
    //displaying the time it took to sort.
    public void showResult(int[] array) {
        System.out.println("Your array has been sorted!");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
