public class Persoana {
    private String nume;
    private float greutate, inaltime;


    public Persoana() {
        this.nume = null;
        this.greutate = 0;
        this.inaltime = 0;
    }

    public void finalize() {
        System.out.println("Distrugerea obiectului a fost apelata.");
    }

    public String getNume() {
        return nume;
    }

    public float getGreutate() {
        return greutate;
    }

    public float getInaltime() {
        return inaltime;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setGreutate(float greutate) {
        this.greutate = greutate;
    }

    public void setInaltime(float inaltime) {
        this.inaltime = inaltime;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", greutate=" + greutate +
                ", inaltime=" + inaltime +
                '}';
    }
}
