import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PainterDefault painterDefault = new PainterDefault();
        Sphere sphere = new Sphere();
        Cube cube = new Cube();
        Cylinder cylinder = new Cylinder();
        int[] data = new int[4];
        for (int i = 0; i < 4; i++) {
            data[i] = sc.nextInt();
        }
        sphere.setR(data[0]);
        cube.setL(data[1]);
        cylinder.setH(data[2]);
        cylinder.setRb(data[3]);
        System.out.println(painterDefault.getPaintQuantity(cube));
        System.out.println(painterDefault.getPaintQuantity(sphere));
        System.out.println(painterDefault.getPaintQuantity(cylinder));

    }
}
