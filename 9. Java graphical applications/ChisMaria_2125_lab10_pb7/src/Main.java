import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) {
        //the panel
        CirclePanel circlePanel = new CirclePanel();
        //the window
        JFrame myFrame = new JFrame("Random circles");
        myFrame.setSize(circlePanel.getWidth(), circlePanel.getHeight());
        myFrame.add(circlePanel);
        myFrame.setVisible(true);

    }
}
