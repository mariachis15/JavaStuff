import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        char[] array = new char[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            int select = rand.nextInt(2);
            if (select == 0) {
                int length = 9;
                array[i] = (char) (48 + rand.nextInt(length));
            } else {
                int length = 26;
                array[i] = (char) (97 + rand.nextInt(length));
            }
        }

        String newString = new String(array);
        System.out.print(newString);

        StringBuilder sb = new StringBuilder(newString);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) >= '0' && sb.charAt(i) <= '9') {
                sb.setCharAt(i, '*');
            }
        }
        newString = sb.toString();
        System.out.println();
        System.out.println(newString);

    }


}
