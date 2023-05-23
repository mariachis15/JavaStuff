import javax.swing.*;
import java.awt.*;

public class CanvasJPanel extends JPanel {
    private int red;
    private int green;
    private int blue;

    public CanvasJPanel(int red, int green, int blue) {
        this.red = red;
        this.blue = blue;
        this.green = green;
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(new Color(red, green, blue));
        g.fillOval(50, 50, 300, 300);
    }

    public void setRed(int red) {
        this.red = red;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }
}
