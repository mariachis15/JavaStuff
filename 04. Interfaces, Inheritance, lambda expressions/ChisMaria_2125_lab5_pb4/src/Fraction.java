public class Fraction {
    protected int a, b;

    Fraction() {
        a = 0;
        b = 1;
    }

    Fraction(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public Fraction simplify() {
        int simplifier = gcd(a, b);
        return new Fraction(a / simplifier, b / simplifier);
    }

    public String toString() {
        return a + "/" + b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
}
