import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Square square = new Square();
        EquilateralTriangle triangle = new EquilateralTriangle();
        RegularHexagon hexagon = new RegularHexagon();
        System.out.println("n (squares) = ");
        int n1 = sc.nextInt();
        System.out.println("Enter n sides: ");
        int[] l1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            l1[i] = sc.nextInt();
        }
        System.out.println("n (triangle) = ");
        int n2 = sc.nextInt();
        System.out.println("Enter n sides: ");
        int[] l2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            l2[i] = sc.nextInt();
        }
        System.out.println("n (hexagon) = ");
        int n3 = sc.nextInt();
        System.out.println("Enter n sides: ");
        int[] l3 = new int[n2];
        for (int i = 0; i < n3; i++) {
            l3[i] = sc.nextInt();
        }
        double squareSurface = 0;
        double squarePerimeter = 0;
        for (int i = 0; i < n1; i++) {
            squareSurface = squareSurface + square.surface(l1[i]);
            squarePerimeter = squarePerimeter + square.perimeter(l1[i]);
        }
        double triangleSurface = 0;
        double trianglePerimeter = 0;
        for (int i = 0; i < n2; i++) {
            triangleSurface = triangleSurface + triangle.surface(l2[i]);
            trianglePerimeter = trianglePerimeter + triangle.perimeter(l2[i]);
        }
        double hexagonSurface = 0;
        double hexagonPerimeter = 0;
        for (int i = 0; i < n3; i++) {
            hexagonSurface = hexagonSurface + hexagon.surface(l3[i]);
            hexagonPerimeter = hexagonPerimeter + hexagon.perimeter(l3[i]);
        }
        double totalSurface = squareSurface + triangleSurface + hexagonSurface;
        double totalPerimeter = squarePerimeter + trianglePerimeter + hexagonPerimeter;
        System.out.println("Total area is: " + totalSurface);
        System.out.println("Total perimeter is: " + totalPerimeter);
    }
}
