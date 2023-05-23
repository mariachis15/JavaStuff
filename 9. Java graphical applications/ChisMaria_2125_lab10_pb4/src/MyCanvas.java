import javax.swing.*;
import java.awt.*;

public class MyCanvas extends Canvas {
    MyCanvas() {
    }

    @Override
    public void paint(Graphics g) {
        int rectangleWidth = getWidth() / 16;
        int rectangleHeight = getHeight();
        int color = 150;
        for (int i = 0; i < 10; i++) {
            g.setColor(new Color(color, color, color));
            g.fillRect(i * rectangleWidth, 0, rectangleWidth, rectangleHeight);
            color -= 15;
        }
        g.setColor(Color.red);
        g.fillRect(10 * rectangleWidth, 0, rectangleWidth, rectangleHeight);
        g.setColor(Color.green);
        g.fillRect(11 * rectangleWidth, 0, rectangleWidth, rectangleHeight);
        g.setColor(Color.blue);
        g.fillRect(12 * rectangleWidth, 0, rectangleWidth, rectangleHeight);
        g.setColor(Color.yellow);
        g.fillRect(13 * rectangleWidth, 0, rectangleWidth, rectangleHeight);
        g.setColor(Color.cyan);
        g.fillRect(14 * rectangleWidth, 0, rectangleWidth, rectangleHeight);
        g.setColor(Color.magenta);
        g.fillRect(15 * rectangleWidth, 0, rectangleWidth, rectangleHeight);

        setVisible(true);
    }

}
