
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operation operation = new Operation();
        System.out.print("a = ");
        double a = sc.nextDouble();
        System.out.print("b = ");
        double b = sc.nextDouble();
        System.out.println("a + b = " + operation.addition(a, b));
        System.out.println("a - b = " + operation.subtraction(a, b));
        System.out.println("a * b = " + operation.multiply(a, b));
        System.out.println("a / b = " + operation.divide(a, b));
        System.out.println("sqrt(a + b) = " + operation.sqrt(a, b));
        System.out.println("a ^ b = " + operation.pow(a, b));
    }
}
