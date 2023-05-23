public class HSVColor extends RGBColor {
    private float h, s, v;

    public HSVColor() {
    }

    public HSVColor(float h, float s, float v) {
        this.h = h;
        this.s = s;
        this.v = v;
    }

    public float getH() {
        return h;
    }

    public void setH(float h) {
        this.h = h;
    }

    public float getS() {
        return s;
    }

    public void setS(float s) {
        this.s = s;
    }

    public float getV() {
        return v;
    }

    public void setV(float v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return "HSVColor {" +
                "h = " + h +
                ", s = " + s +
                ", v = " + v +
                '}';
    }
}
