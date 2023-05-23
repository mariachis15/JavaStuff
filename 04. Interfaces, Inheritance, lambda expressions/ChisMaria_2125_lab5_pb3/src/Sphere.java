public class Sphere extends SpatialShape {
    private int r;

    double surface() {
        double pi = 3.14159265359;
        return 4 * pi * Math.pow(r, 2);
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return name + " r = " + r;
    }
}
