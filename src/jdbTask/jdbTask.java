public class jdbTask {
    public static void main(String args[]) {
        fibonacciSequence(5);
        fibonacciArray(5);
    }

    /*
     * Print a fibonacci sequence of length n
     */
    public static void fibonacciSequence(int n) {
        int backOne = 1;
        int backTwo = 0;
        for (int i = 0; i < n; i++) {
            int sum = backOne + backTwo;
            backTwo = backOne;
            backOne = sum;
            System.out.println(backTwo + " ");
        }
    }

    /*
     * @return a fibonacci array of length n
     */
    public static int[] fibonacciArray(int n) {
        int backOne = 1;
        int backTwo = 0;
        int[] fibonacciArray = new int[n];
        for (int i = 0; i <= n; i++) {
            int sum = backOne + backTwo;
            backTwo = backOne;
            backOne = sum;
            fibonacciArray[i] = backTwo;
        }
        return fibonacciArray;
    }
}