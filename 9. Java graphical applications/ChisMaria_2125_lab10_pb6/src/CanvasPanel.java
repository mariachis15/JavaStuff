import javax.swing.*;
import java.awt.*;

public class CanvasPanel extends JPanel {
    CanvasPanel() {
        this.setSize(500, 400);
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.cyan);
        g.fillRect(100, 150, 270, 100);
        g.setColor(Color.cyan);
        g.fillOval(140, 50, 200, 200);
        g.setColor(Color.cyan);
        g.fillOval(62, 150, 100, 100);
        g.setColor(Color.gray);
        g.fillRect(180, 100, 50, 50);
        g.setColor(Color.black);
        g.drawRect(180, 100, 50, 50);
        g.setColor(Color.gray);
        g.fillRect(250, 100, 50, 50);
        g.setColor(Color.black);
        g.drawRect(250, 100, 50, 50);
        g.setColor(Color.black);
        g.fillOval(150, 250, 50, 50);
        g.setColor(Color.black);
        g.fillOval(300, 250, 50, 50);
        g.setColor(Color.blue);
        g.drawString("Ugly car", 225, 30);
    }

}
