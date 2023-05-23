import Package.*;

public class Class2 extends Class1 implements Int1, Int2 {

    public Class2(double n1, double n2) {
        super(n1, n2);
    }

    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public double product(double num1, double num2) {
        return num1 * num2;
    }

}
