import javax.swing.*;
import java.awt.*;

public class ColorText extends JPanel {
    JTextField red;
    JTextField green;
    JTextField blue;
    JLabel finalColor;

    ColorText() {
        this.setLayout(new GridLayout(4, 2));

        red = new JTextField();
        JLabel redLabel = new JLabel("                              R = ");
        redLabel.setForeground(Color.red);
        this.add(redLabel);
        this.add(red);


        green = new JTextField();
        JLabel greenLabel = new JLabel("                              G = ");
        greenLabel.setForeground(Color.green);
        this.add(greenLabel);
        this.add(green);

        blue = new JTextField();
        JLabel blueLabel = new JLabel("                              B = ");
        blueLabel.setForeground(Color.blue);
        this.add(blueLabel);
        this.add(blue);

        JButton colorButton = new JButton("Result");
        finalColor = new JLabel();
        this.add(colorButton);
        this.add(finalColor);

        colorButton.addActionListener(e -> makeColor());

    }

    public void makeColor() {
        int r = Integer.parseInt(red.getText());
        if (r > 255) {
            throw new RuntimeException("The value for RED must be under 255.");
        }
        int g = Integer.parseInt(green.getText());
        if (g > 255) {
            throw new RuntimeException("The value for GREEN must be under 255.");
        }
        int b = Integer.parseInt(blue.getText());
        if (b > 255) {
            throw new RuntimeException("The value for BLUE must be under 255.");
        }
        String text = "     Enjoy your color!";
        finalColor.setText(text);
        finalColor.setForeground(new Color(r, g, b));

    }
}
