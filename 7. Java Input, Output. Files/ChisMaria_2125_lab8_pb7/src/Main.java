import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            integerList.add(sc.nextInt());
        }
        IntegerWrapper integerWrapper = new IntegerWrapper(integerList);
        Collections.sort(integerWrapper.getIntegers());
        for (Integer i : integerWrapper.getIntegers()) {
            System.out.println(i);
        }
        try {
            FileOutputStream fileOut = new FileOutputStream("integers.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(integerWrapper);
            out.close();
            fileOut.close();

            FileInputStream fileIn = new FileInputStream("integers.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            IntegerWrapper readIntegerWrapper = (IntegerWrapper) in.readObject();
            System.out.println(readIntegerWrapper);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
