import java.util.Scanner;

public class Main {
    public static int bubbleSort(int[] array) {
        int n = array.length;
        int aux = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {
                    aux = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = aux;
                }
            }
        }
        return aux;
    }

    public static int insertionSort(int[] array){
        int n = array.length;
        int aux = 0;
        int j;
        for(int i = 0; i < n;  i++){
            aux = array[i];
            j = i - 1;
            while( ( j > -1) && (array[j] > aux)){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = aux;
        }
        return aux;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        //bubbleSort(array)
        insertionSort(array);
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}
