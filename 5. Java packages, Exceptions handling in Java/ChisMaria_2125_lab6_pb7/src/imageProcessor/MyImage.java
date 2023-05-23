package imageProcessor;

import java.util.Random;

public class MyImage {
    int n;
    int m;
    Pixel[][] pixels;

    public MyImage(int n, int m) {
        Random r = new Random();
        this.n = n;
        this.m = m;
        pixels = new Pixel[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                pixels[i][j] = new Pixel(r.nextInt(256), r.nextInt(256), r.nextInt(256));
            }
        }
    }

    public void deletePixels(int r, int g, int b) {
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Pixel pixel = pixels[i][j];
                if (pixel.getR() < r || pixel.getG() < g || pixel.getB() < b) {
                    pixels[i][j] = null;
                }
            }
        }
        long stop = System.nanoTime();
        System.out.println("Operation time: " + (stop - start) + " nanoseconds.");
    }

    public void deleteComponents() {
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (pixels[i][j] != null) {
                    pixels[i][j].setR(0);
                    pixels[i][j].setG(0);
                    pixels[i][j].setB(0);
                }
            }
        }
        long stop = System.nanoTime();
        System.out.println("Operation time: " + (stop - start) + " nanoseconds.");
    }

    public void greyPixels() {
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                double grey = 0.21 * pixels[i][j].getR() + 0.71 * pixels[i][j].getG() + 0.07 * pixels[i][j].getB();
                pixels[i][j].setR((int) grey);
                pixels[i][j].setG((int) grey);
                pixels[i][j].setB((int) grey);
            }
        }
        long stop = System.nanoTime();
        System.out.println("Operation time: " + (stop - start) + " nanoseconds.");
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public Pixel getPixel(int i, int j) {
        return pixels[i][j];
    }

    public void setPixel(int i, int j, Pixel pixel) {
        pixels[i][j] = pixel;
    }

    public String showImagePixels() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                stringBuilder.append(pixels[i][j])
                        .append(" ");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "MyImage {" +
                " n = " + n +
                ", m = " + m +
                ", pixels = \n" + showImagePixels();
    }
}

