import java.util.Random;
import java.util.Scanner;
public class Methods {

    public float getAverage(int n, int... nr) {
        float m = 0;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n integers:");
        nr = new int[n];
        for (int i = 0; i < n; i++) {
            nr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sum = sum + nr[i];
        }
        m = (float) sum / n;
        System.out.println("Arithmetic mean:");
        return m;

    }

    public double[] generateRandomArray(int n) {
        //Scanner sc = new Scanner(System.in);
        double[] array = new double[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextDouble();
        }
        return array;
    }

    public static String transformToUppercase(char[] array) {
        char[] newArray = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = Character.toUpperCase(array[i]);
        }
        return new String(newArray);
    }

}
