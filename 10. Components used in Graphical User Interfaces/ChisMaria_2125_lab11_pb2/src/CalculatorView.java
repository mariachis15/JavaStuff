
import javax.swing.*;
import java.awt.*;

public class CalculatorView extends JFrame {

    final static boolean shouldFill = true;
    final static boolean RIGHT_TO_LEFT = false;

    //create the frame
    JFrame frame = new JFrame("Calculator");

    JPanel panel = new JPanel();

    //call the methods in constructor
    public CalculatorView() {
        prepareGui();
        addComponents();
    }

    //the method is meant to prepare the frame and add the layouts for the panels
    public void prepareGui() {
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null); //this set the frame in the middle of the screen
        frame.setLayout(new GridBagLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addComponents() {
        if (RIGHT_TO_LEFT) {
            panel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }

        JButton button;
        panel.setLayout(new GridBagLayout());
        GridBagConstraints b = new GridBagConstraints();
        GridBagConstraints c = new GridBagConstraints();

        if (shouldFill) {
            c.fill = GridBagConstraints.HORIZONTAL;
        }
        if (shouldFill) {
            b.fill = GridBagConstraints.HORIZONTAL;
        }


        JTextField inputField;
        inputField = new JTextField();
        b.weightx = 10;
        b.gridwidth = 3;
        b.gridx = 0;
        b.gridy = 0;
        panel.add(inputField, b);

        JTextField outputField;
        outputField = new JTextField();
        outputField.setEnabled(false);
        b.weightx = 10;
        b.gridwidth = 0;
        b.gridx = 1;
        b.gridy = 0;
        panel.add(outputField, b);

        button = new JButton("1");
        c.gridx = 0;
        c.gridy = 1;
        panel.add(button, c);

        button = new JButton("2");
        c.gridx = 1;
        c.gridy = 1;
        panel.add(button, c);

        button = new JButton("3");
        c.gridx = 2;
        c.gridy = 1;
        panel.add(button, c);

        button = new JButton("+");
        c.gridx = 3;
        c.gridy = 1;
        panel.add(button, c);

        button = new JButton("-");
        c.gridx = 4;
        c.gridy = 1;
        panel.add(button, c);

        button = new JButton("4");
        c.gridx = 0;
        c.gridy = 2;
        panel.add(button, c);

        button = new JButton("5");
        c.gridx = 1;
        c.gridy = 2;
        panel.add(button, c);

        button = new JButton("6");
        c.gridx = 2;
        c.gridy = 2;
        panel.add(button, c);

        button = new JButton("x");
        c.gridx = 3;
        c.gridy = 2;
        panel.add(button, c);

        button = new JButton("/");
        c.gridx = 4;
        c.gridy = 2;
        panel.add(button, c);

        button = new JButton("7");
        c.gridx = 0;
        c.gridy = 3;
        panel.add(button, c);

        button = new JButton("8");
        c.gridx = 1;
        c.gridy = 3;
        panel.add(button, c);

        button = new JButton("9");
        c.gridx = 2;
        c.gridy = 3;
        panel.add(button, c);

        button = new JButton("M+");
        c.gridx = 3;
        c.gridy = 3;
        panel.add(button, c);

        button = new JButton("M-");
        c.gridx = 4;
        c.gridy = 3;
        panel.add(button, c);

        button = new JButton(".");
        c.gridx = 0;
        c.gridy = 4;
        panel.add(button, c);

        button = new JButton("0");
        c.gridx = 1;
        c.gridy = 4;
        panel.add(button, c);

        button = new JButton("C");
        c.gridx = 2;
        c.gridy = 4;
        panel.add(button, c);

        button = new JButton("MR");
        c.gridx = 3;
        c.gridy = 4;
        panel.add(button, c);

        button = new JButton("=");
        c.gridx = 4;
        c.gridy = 4;
        panel.add(button, c);

        frame.add(panel);
        frame.repaint();
        frame.setVisible(true);
    }
}
