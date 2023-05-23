import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Position[] points = new Position[3];
        System.out.println("Enter number of points:");
        int nr = sc.nextInt();
        sc.nextLine();
        if (nr > 3) {
            throw new ArrayIndexOutOfBoundsException("You can enter only 3 points.");
        }
        System.out.println("Enter the points: (name + coordinates)");
        int currentLength = 0;
        for (int i = 0; i < nr; i++) {
            points[i] = new Position();
            points[i].setNamePoint(sc.nextLine());
            points[i].setX(sc.nextInt());
            points[i].setY(sc.nextInt());
            points[i].setZ(sc.nextInt());
            sc.nextLine();
            try {
                if (points[i].tooClosePosition(points, currentLength) == true) {
                    throw new TooClosePositionException();
                }
            } catch (TooClosePositionException e) {
                System.out.println("Point too close. Enter another point!");
                points[i] = new Position();
                points[i].setNamePoint(sc.nextLine());
                points[i].setX(sc.nextInt());
                points[i].setY(sc.nextInt());
                points[i].setZ(sc.nextInt());
                sc.nextLine();
            }
            currentLength++;
        }
        System.out.println("The points are: ");
        for (int i = 0; i < nr; i++) {
            System.out.println(points[i]);
        }
    }
}
