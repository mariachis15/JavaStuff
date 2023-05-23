import javax.swing.*;

public class Car extends JFrame {
    CanvasPanel canvasPanel = new CanvasPanel();

    Car(String title) {
        super(title);
        this.setSize(canvasPanel.getWidth(), canvasPanel.getHeight());
        this.setLocation(500, 250);
        this.setVisible(true);
        this.add(canvasPanel);
    }


}
