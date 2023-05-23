import javax.swing.*;
import java.awt.*;

public class MyImage extends JFrame {
    public MyImage(String title) {
        super("Little Cat");

        JLabel filenameLabel = new JLabel("", JLabel.CENTER);
        filenameLabel.setFont(new Font("Times New Roman", 1, 13));
        ImageIcon imageIcon = new ImageIcon(title);
        JLabel imageLabel = new JLabel("", imageIcon, JLabel.CENTER);
        filenameLabel.setText(new java.io.File(title).getName());

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(imageLabel, BorderLayout.CENTER);
        panel.add(filenameLabel, BorderLayout.SOUTH);
        panel.setBackground(new Color(196, 116, 243));
        add(panel);
        setSize(900, 600);
        setVisible(true);
    }

}