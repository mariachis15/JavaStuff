import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame("My panel");
        f.add(new MyPanel());
        f.setSize(600, 600);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
