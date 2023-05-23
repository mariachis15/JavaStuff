public class Producer extends Thread {
    private Fibonacci fibonacci;
    private int x;

    public Producer(Fibonacci fibonacci, int x) {
        this.fibonacci = fibonacci;
        this.x = x;
    }

    public void run() {
        int number = fibonacci.getFibonacciNumber(x);
        System.out.println("Fibonacci number: " + number);
    }
}