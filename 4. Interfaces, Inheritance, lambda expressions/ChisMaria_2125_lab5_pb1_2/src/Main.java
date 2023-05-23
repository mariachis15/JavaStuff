import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        double a = sc.nextDouble();
        System.out.print("b = ");
        double b = sc.nextDouble();

        Adder adder = (num1, num2) -> (num1 + num2);
        System.out.println(adder.sum(a, b));
        Subtractor subtractor = (num1, num2) -> (num1 - num2);
        System.out.println(subtractor.subtract(a, b));
        Multiplier multiplier = (num1, num2) -> (num1 * num2);
        System.out.println(multiplier.multiply(a, b));
        Divider divider = (num1, num2) -> (num1 / num2);
        System.out.println(divider.division(a, b));
        RootExtractor root = (num1, num2) -> (Math.sqrt(a + b));
        System.out.println(root.sqrt(a, b));
        PowUpper power = (num1, num2) -> (Math.pow(num1, num2));
        System.out.println(power.pow(a, b));

    }
}
