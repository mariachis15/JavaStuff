public class Fibonacci {
    private boolean available = true;

    public synchronized int getFibonacciNumber(int x) {
        while (available == false) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        int[] array = new int[x];
        array[0] = 0;
        array[1] = 1;
        array[2] = 1;
        for (int i = 2; i < x; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        available = false;
        notifyAll();
        return array[x - 1];
    }

    public synchronized void printFibonacciNumbers(int x) {
        while (available == true) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        int[] array = new int[x];
        array[0] = 0;
        array[1] = 1;
        array[2] = 1;
        for (int i = 2; i < x; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        for (int i = 0; i < x; i++) {
            System.out.println("intermediate value: " + array[i]);
        }
        available = true;
        notifyAll();
    }
}

