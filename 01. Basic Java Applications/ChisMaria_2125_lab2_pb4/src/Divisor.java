import java.util.Scanner;

public class Divisor {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        n = scanner.nextInt();
        System.out.println("All the divisors of the number are:");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }

        }
    }
}
