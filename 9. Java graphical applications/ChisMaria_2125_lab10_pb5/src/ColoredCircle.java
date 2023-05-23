import javax.swing.*;

public class ColoredCircle extends JFrame {

    public ColoredCircle() throws InterruptedException {
        super("Colored Circle");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CanvasJPanel circlePanel = new CanvasJPanel(255, 0, 0);
        add(circlePanel);
        setVisible(true);
        while (true) {
            for (int red = 255; red >= 0; red--) {
                circlePanel.setRed(red);
                circlePanel.repaint();
                Thread.sleep(5);
                for (int green = 0; green <= 255; green++) {
                    circlePanel.setGreen(green);
                    circlePanel.repaint();
                    Thread.sleep(5);
                    for (int blue = 1; blue < 255; blue++) {
                        circlePanel.setBlue(blue);
                        circlePanel.repaint();
                        Thread.sleep(5);
                    }
                }
            }
        }
    }

}