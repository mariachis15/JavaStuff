import java.time.LocalDate;

public class Main {
    public static void main (String[] args) {

    Copil copil = new Copil("Eusebiu", LocalDate.of(2011, 10, 3));
    copil.setNume("Maria");
    copil.setDataNasterii( LocalDate.of(2010, 3, 15));
    copil.spuneNumele();
    copil.spuneVarsta();
    copil.adunaNumere(9,2);
    copil.spuneAlfabetul();
        System.out.println();
    copil.deseneazaTablaDeSah(3,3);
    }


}
