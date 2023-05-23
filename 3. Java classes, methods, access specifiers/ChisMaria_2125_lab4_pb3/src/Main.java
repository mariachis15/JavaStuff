public class Main {
    public static void main(String[] args) {
        int[][] newMatrix = new int[][]{
                {1, 2, 3},
                {2, 3, 4},
                {3, 4, 5}
        };
        Java java = new Java(3, 3, newMatrix);
        java.printMatrix();
        int[][] otherMatrix = new int[][]{
                {8, 1, 5},
                {9, 3, 4},
                {0, 2, 11}
        };
        System.out.println();
        java.addTwoMatrix(otherMatrix, 3, 3);
        System.out.println();
        int[][] subMatrix = java.substrTwoMatrix(otherMatrix, 3, 3);
        Java obj3 = new Java(3, 3, subMatrix);
        obj3.printMatrix();
    }
}
