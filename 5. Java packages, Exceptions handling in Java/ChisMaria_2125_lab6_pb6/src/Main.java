public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            RGBColor rgbColor = new RGBColor();
            rgbColor = rgbColor.generateRandomColor();
            HSVColor hsvColor = rgbColor.convertRGBColorToHSVColor();
            if (hsvColor.getS() == 0.9f) {
                throw new SaturationException("The color saturation is 90.");
            }
            if (hsvColor.getS() > 0.9f) {
                System.out.println("Saturated color:\n" + hsvColor);
                return;
            }
        }
        throw new LimitedGenerationsExceeded("Time limited exception.");
    }
}
