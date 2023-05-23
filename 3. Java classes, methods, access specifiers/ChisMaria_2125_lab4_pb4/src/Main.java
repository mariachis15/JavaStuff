import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        sc.nextLine();
        Persoana[] obiecte = new Persoana[n];
        for (int i = 0; i < n; i++) {
            obiecte[i] = new Persoana();
        }
        for (int i = 0; i < n; i++) {
            String linie = sc.nextLine();
            String[] campuri = linie.split(" ");
            obiecte[i].setNume(campuri[0]);
            obiecte[i].setGreutate(Float.parseFloat(campuri[1]));
            obiecte[i].setInaltime(Float.parseFloat(campuri[2]));
        }
        for (int i = 0; i < n; i++) {
            System.out.println(obiecte[i]);
        }




    }

}
