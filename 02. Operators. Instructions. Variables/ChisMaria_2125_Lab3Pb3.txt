import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string:");
            String word = sc.nextLine();
            char[] charArray = new char[1000];
            for (int i = 0; i < word.length(); i++) {
                charArray[i] = word.charAt(i);
            }
            char[] newArray = new char[1000];
            System.arraycopy(charArray, 0, newArray, 0, 3);
            System.out.println("New array:");
            for(int i = 0; i<3;i++){
                System.out.print(newArray[i]);
            }
        }


    }

