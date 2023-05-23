import java.util.Scanner;

public class Prim {
    public static boolean isPrime(int n) {
        for (int d = 2; d <= n / 2; d++) {
            if (n % d == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scanner.nextInt();
        System.out.println("Now enter n numbers:");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (isPrime(array[i]) == true) {
                System.out.println(array[i] + " --  is prime.");
            } else {
                System.out.println(array[i] + " -- not prime.");
            }
        }

    }
}
