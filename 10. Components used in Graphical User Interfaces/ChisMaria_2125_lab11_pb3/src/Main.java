import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        MyTabbedView firstTry = new MyTabbedView();
        JFrame frame = new JFrame("Tabbed View");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        firstTry.addComponentToPane(frame.getContentPane());
        frame.setVisible(true);

    }
}
