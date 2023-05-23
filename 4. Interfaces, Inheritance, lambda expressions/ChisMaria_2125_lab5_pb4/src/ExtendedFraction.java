public class ExtendedFraction extends Fraction {
    ExtendedFraction(int a, int b) {
        super(a, b);
    }

    @Override
    public int gcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public boolean superunitary(int a, int b) {
        if (a > b) {
            return true;
        } else
            return false;

    }
}

