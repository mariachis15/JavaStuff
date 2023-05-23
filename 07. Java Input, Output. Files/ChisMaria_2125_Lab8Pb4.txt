import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File inputFile = new File("input.bin");
        File outputFile = new File("output.bin");
        byte buf[] = new byte[256];
        try {
            FileInputStream fis = new FileInputStream(inputFile);
            FileOutputStream fos = new FileOutputStream(outputFile);
            byte[] bitcoin = new byte[256];
            byte[] finalArray = new byte[256];
            String bit = scanner.nextLine();
            for (int i = 0; i < 256; i++) {
                bitcoin[i] = (byte) bit.charAt(i);
            }
            fis.read(buf, 0, 256);
            for (int i = 0; i < 256; i++) {
                finalArray[i] = (byte) (bitcoin[i] ^ buf[i]);
                System.out.println(finalArray[i]);
            }
            fos.write(finalArray, 0, 256);
            fis.close();
            fos.close();
        } catch (IOException e) {
            System.out.println("ERROR: " + e.toString());
        }
    }
}
