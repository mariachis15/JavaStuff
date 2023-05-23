import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer number:");
        n = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println("The factorial of the number is:");
        System.out.println(factorial);
    }

}
