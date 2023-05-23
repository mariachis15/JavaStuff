public class Cylinder extends SpatialShape {
    private int h, rb;

    double surface() {
        double pi = 3.14159265359;
        return 2 * pi * rb * (rb + h);
    }

    public int getH() {
        return h;
    }

    public int getRb() {
        return rb;
    }

    public void setH(int h) {
        this.h = h;
    }

    public void setRb(int rb) {
        this.rb = rb;
    }

    @Override
    public String toString() {
        return name + " h = " + h + " rb = " + rb;
    }
}
