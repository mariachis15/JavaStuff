import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("");
        frame.setLocation(600, 150);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        OnlineCourse onlineCourse = new OnlineCourse();
        frame.add(onlineCourse);
        frame.setVisible(true);
    }

}
