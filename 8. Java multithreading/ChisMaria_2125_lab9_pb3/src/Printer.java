public class Printer extends Thread {
    private Fibonacci fibonacci;
    private int x;

    public Printer(Fibonacci fibonacci, int x) {
        this.fibonacci = fibonacci;
        this.x = x;
    }

    public void run() {
        fibonacci.printFibonacciNumbers(x);
    }
}
