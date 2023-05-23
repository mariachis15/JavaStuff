public class Java {
    private int n, m;
    private int[][] matrix;

    //constructor
    public Java(int n, int m, int[][] matrix) {
        this.n = n;
        this.m = m;
        this.matrix = matrix;
    }

    // setter & getter methods
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    // others methods
    public void printMatrix() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void addTwoMatrix(int[][] matrix1, int n1, int m1) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println(" + ");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println(" = ");
        if (n == n1 & m == m1) {
            int[][] sumMatrix = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    sumMatrix[i][j] = matrix[i][j] + matrix1[i][j];
                    System.out.print(sumMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public int[][] substrTwoMatrix(int[][] matrix1, int n1, int m1) {
        int[][] subMatrix = new int[n][m];
        if (n == n1 & m == m1) {
            subMatrix = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    subMatrix[i][j] = matrix[i][j] - matrix1[i][j];
                }
            }
        }
        return subMatrix;
    }
}
