import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("NAME AND GROUP");
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        NameGroupPrinter nameGroupPrinter = new NameGroupPrinter();
        frame.add(nameGroupPrinter);
        frame.setVisible(true);
    }
}
