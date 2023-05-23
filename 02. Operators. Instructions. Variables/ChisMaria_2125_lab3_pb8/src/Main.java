import java.util.Scanner;

public class Main {
    public static void printMatrix(int[][] matrix, int m) {
        int n = 1;
        System.out.println("Line by line:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            n++;
            System.out.println();
        }
        System.out.println("Column by column:");
        n = 0;
        for (int j = 0; j < m; j++) {
            for (int i = n; i < m; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            n++;
            System.out.println();
        }
    }

    public static void eraseFromMatrix(int[][] matrix, int m) {
        int n = 1;
        System.out.println("New matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] > 2 && matrix[i][j] < 19) {
                    matrix[i][j] = 0;
                }
                System.out.print(matrix[i][j] + " ");
            }
            n++;
            System.out.println();
        }

    }

    public static void printNeighbours(int[][] matrix, int i, int j) {
        System.out.println("The neighbours are:");
        System.out.print(matrix[i - 1][j - 1] + " ");
        System.out.print(matrix[i - 1][j] + " ");
        System.out.print(matrix[i - 1][j + 1] + " ");
        System.out.print(matrix[i][j - 1] + " ");
        System.out.print(matrix[i][j + 1] + " ");
        System.out.print(matrix[i + 1][j - 1] + " ");
        System.out.print(matrix[i + 1][j] + " ");
        System.out.print(matrix[i + 1][j + 1] + " ");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = Integer.parseInt(args[0]);
        System.out.println(m);
        int n = 1;
        int[][] matrix = new int[100][100];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
            n++;
        }
        printMatrix(matrix, m);
        eraseFromMatrix(matrix, m);
        printNeighbours(matrix, 1, 1);
    }
}
