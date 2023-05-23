import static java.lang.Math.max;

public class CmmdcCalculator extends Thread {
    private int a;
    private int b;

    public CmmdcCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        int max = max(a, b);
        for (int d = max; d >= 1; d--) {
            if (a % d == 0 && b % d == 0) {
                System.out.println("cmmdc a = " + a + " b = " + b + " : " + d);
                break;
            }
        }
    }
}
