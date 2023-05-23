import java.util.Scanner;

public class Table {
    public static int getFreqChar(char[] array, int length, char c) {
        int n = 0;
        for (int i = 0; i < length; i++) {
            if (array[i] == c) {
                n++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String word = sc.nextLine();
        System.out.println("Enter a char:");
        char character = sc.next().charAt(0);
        int length = word.length();
        char[] charArray = new char[1000];
        for (int i = 0; i < word.length(); i++) {
            charArray[i] = word.charAt(i);
        }
        System.out.println(getFreqChar(charArray, length, character));
    }


}
