import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Methods methods = new Methods();
        Scanner sc = new Scanner(System.in);
        System.out.println("n=");
        int n = sc.nextInt();
        System.out.println(methods.getAverage(n));

        double[] array = new double[n];
        array = methods.generateRandomArray(n);
        System.out.println("Random array of n numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
            System.out.println();
        }
        System.out.println("Enter an array of char:");
        char[] newArray = new char[n];
        for (int i = 0; i < n; i++) {
            newArray[i] = sc.next().charAt(0);
        }

        System.out.println(Methods.transformToUppercase(newArray));

    }
}
