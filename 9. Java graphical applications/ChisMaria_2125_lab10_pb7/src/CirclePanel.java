import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class CirclePanel extends JPanel {
    //these are the limits for the random radius
    private int max = 100;
    private int min = 50;

    //constructor
    CirclePanel() {
        this.setVisible(true);
        this.setSize(800, 800);
    }

    @Override
    public void paint(Graphics g) {
        Random rand = new Random();
        //the x and y for the first circle
        int x = 0;
        int y = 0;
        //generate the random radius
        int radius = rand.nextInt(max) + min;
        Color randomColor;
        for (int i = 0; i < getHeight(); i++) {
            for (int j = 0; j < getWidth(); j++) {
                //the random colors
                randomColor = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
                g.setColor(randomColor);
                g.fillOval(x, y, 2 * radius, 2 * radius);
                x = x + 2 * radius;

            }
            y = y + 2 * radius;
            x = 0;

        }

    }
}
