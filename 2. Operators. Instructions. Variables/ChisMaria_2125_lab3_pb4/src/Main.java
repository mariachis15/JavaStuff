import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //binary
        int a = n / 2;
        int r = n % 2;
        int index = 0;
        int[] array = new int[100];
        array[index]=r;
        index++;
        while (a != 0) {
            r = a % 2;
            a = a / 2;
            array[index] = r;
            index++;
        }
        for (int i = index-1; i >= 0; i--) {
            System.out.print(array[i]);
        }
    }
}
