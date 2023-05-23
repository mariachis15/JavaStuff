import java.time.LocalDate;

public class Copil {
    private String nume;
    private LocalDate dataNasterii;

    public Copil(String nume, LocalDate dataNasterii) {
        this.nume = nume;
        this.dataNasterii = dataNasterii;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public LocalDate getDataNasterii() {
        return dataNasterii;
    }

    public void setDataNasterii(LocalDate dataNasterii) {
        this.dataNasterii = dataNasterii;
    }

    public void spuneNumele() {
        System.out.println("Salut, numele meu este " + getNume()+".");
    }

    public void spuneVarsta() {
        int anCurent = 2023;
        int varsta = anCurent - dataNasterii.getYear();
        System.out.println("Am " + varsta + " ani.");

    }

    public void adunaNumere(int a, int b) {
        int suma = 0;
        if (a < 10 && b < 10) {
            suma = a + b;
            System.out.println("Suma lui " + a + " si " + b + " este " + suma+ ".");
        } else {
            System.out.println("Nu stiu sa adun aceste 2 numere.");
        }

    }

    public void spuneAlfabetul() {
        System.out.println("Alfabetul in forma directa: ");
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + " ");
        }
        System.out.println();
        System.out.println("Alfabetul in forma inversa: ");
        for (char c = 'z'; c >= 'a'; c--) {
            System.out.print( c + " ");
        }
    }

    public void spuneLaRevedere() {
        System.out.println("La revedere!");
    }

    public void deseneazaTablaDeSah(int n, int m) {
        int[][] tabla = new int[n][m];
        int contor = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (contor % 2 == 0) {
                    tabla[i][j] = 0;
                } else {
                    tabla[i][j] = 1;
                }
                contor++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }
    }
}