import java.util.Random;

public class RGBColor {
    private int r;
    private int g;
    private int b;


    public RGBColor() {
        r = 0;
        g = 0;
        b = 0;
    }

    public RGBColor(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }


    public RGBColor generateRandomColor() {
        Random random = new Random();
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);
        return new RGBColor(r, g, b);
    }


    public HSVColor convertRGBColorToHSVColor() {
        HSVColor hsvColor = new HSVColor();
        float redFloat = r / 255.0f;
        float greenFloat = g / 255.0f;
        float blueFloat = b / 255.0f;
        float maxColor = Math.max(Math.max(redFloat, greenFloat), blueFloat);
        float minColor = Math.min(Math.min(redFloat, greenFloat), blueFloat);
        float delta = maxColor - minColor;

        if (delta == 0) {
            hsvColor.setH(0);
        } else if (maxColor == redFloat) {
            hsvColor.setH((60 * ((greenFloat - blueFloat) / delta) + 360) % 360);
        } else if (maxColor == greenFloat) {
            hsvColor.setH((60 * ((blueFloat - redFloat) / delta) + 120) % 360);
        } else {
            hsvColor.setH((60 * ((redFloat - greenFloat) / delta) + 240) % 360);
        }
        if (maxColor == 0) {
            hsvColor.setS(0);
        } else {
            hsvColor.setS(delta / maxColor);
        }

        hsvColor.setV(maxColor);
        return hsvColor;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
