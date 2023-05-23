import imageProcessor.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyImage myImage = new MyImage(5, 5);
        System.out.println(myImage);
        System.out.println();
        System.out.println();
        myImage.deletePixels(50, 50, 50);
        System.out.println(myImage);

        System.out.println();
        System.out.println();
        myImage.deleteComponents();
        System.out.println(myImage);

        MyImage secondImage = new MyImage(5, 5);
        System.out.println(secondImage);
        System.out.println();
        System.out.println();
        secondImage.greyPixels();
        System.out.println(secondImage);
    }
}
