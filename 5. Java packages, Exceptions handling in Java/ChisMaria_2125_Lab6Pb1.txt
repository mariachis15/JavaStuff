import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n = ");
        int n = sc.nextInt();
        System.out.println("The array: ");
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextDouble();
        }
        try {
            System.out.println(array[n]);
        } catch (ArrayIndexOutOfBoundsException exception1) {
            System.out.println("The value can not be accessed.");
        }
        try {
            System.out.println(array[-1]);
        } catch (ArrayIndexOutOfBoundsException exception1) {
            System.out.println("The value can not be accessed because the index is negative..");
        }


        System.out.println("Number of the lines: ");
        int l = sc.nextInt();
        int c = 3;
        int[][] matrix = new int[l][c];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        try {
            System.out.println(matrix[-1][2]);
        } catch (ArrayIndexOutOfBoundsException exception2) {
            System.out.println("The element of the matrix can not be accessed.");
        }
        int lines = sc.nextInt();
        int[] columns = new int[lines];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < lines; i++) {
            columns[i] = sc.nextInt();
            if (columns[i] > max) {
                max = columns[i];
            }
        }
        int[][] mat = new int[lines][max];
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns[i]; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        try {
            int i = 1, j = columns[i];
            if (j > columns[i] - 1) {
                throw new ArrayIndexOutOfBoundsException();
            }
            System.out.println(mat[i][j]);
        } catch (ArrayIndexOutOfBoundsException exception2) {
            System.out.println("The element of the matrix can not be accessed.");
        }
    }
}
