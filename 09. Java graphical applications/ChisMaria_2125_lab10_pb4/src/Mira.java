import javax.swing.*;

public class Mira extends JFrame {

    Mira(String title) {
        super(title);
        this.setSize(512, 600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(new MyCanvas());
        this.setVisible(true);

    }
}
