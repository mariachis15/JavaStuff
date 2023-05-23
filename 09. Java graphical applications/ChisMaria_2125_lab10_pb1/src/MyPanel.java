import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    public void paint(Graphics g) {
        int width = getWidth();
        int height = getHeight();
        g.setColor(Color.blue);
        FontMetrics fontMetrics = g.getFontMetrics();
        String title = "Maria Chis, 2125";
        int titleHeight = fontMetrics.getAscent();
        int titleWidth = fontMetrics.stringWidth(title);
        g.drawString(title, (width - titleWidth) / 2, (height - titleHeight) / 2);
    }

}