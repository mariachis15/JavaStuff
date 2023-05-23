public class Cube extends SpatialShape {
    private int l;

    double surface() {
        return 6 * Math.pow(l, 2);
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }
    @Override
    public String toString() {
        return name + " l = " + l;
    }
}
