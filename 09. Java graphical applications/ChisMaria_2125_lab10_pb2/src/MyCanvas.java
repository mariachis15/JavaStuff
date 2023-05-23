import java.awt.*;

public class MyCanvas extends Canvas {
    MyCanvas() {
        this.setSize(new Dimension(300, 500));
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        int diameter = Math.min(getWidth(), getHeight());
        int x = (getWidth() - diameter) / 2;
        int y = (getHeight() - diameter) / 2;
        g.setColor(Color.red);
        g.fillOval(x, y, diameter, diameter);
        setVisible(true);
    }
}
