import javax.swing.*;

public class MyFrame extends JFrame {
    MyCanvas canvas;

    MyFrame(String title) {
        super(title);
    }

    public void paint() {
        canvas = new MyCanvas();

        this.setSize(canvas.getWidth(), canvas.getHeight());
        this.setLocation(500, 250);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(canvas);
        this.setVisible(true);
    }
}
