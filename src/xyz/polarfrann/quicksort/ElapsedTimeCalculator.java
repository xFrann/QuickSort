package xyz.polarfrann.quicksort;

public class ElapsedTimeCalculator {
    private long start;
    public ElapsedTimeCalculator(long start) {
        this.start = start;
    }
    //Returns the elapsed time between the @param start milliseconds
    //and the call of the function
    public long calculateElapsedTime() {
        return System.currentTimeMillis() - this.start;
    }

}
