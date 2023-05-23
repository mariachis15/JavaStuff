import javax.swing.*;
import java.awt.*;

public class NameGroupPrinter extends JPanel {
    private JTextField name;
    private JTextField group;
    private JLabel information;

    NameGroupPrinter() {
        //set the layout for the panel
        this.setLayout(new GridLayout(3, 2));

        //create the label and the text field for the name
        JLabel nameLabel = new JLabel("Enter your name: ");
        name = new JTextField();
        this.add(nameLabel);
        this.add(name);

        //create the label and the text field for the group
        JLabel groupLabel = new JLabel("Enter your group: ");
        group = new JTextField();
        this.add(groupLabel);
        this.add(group);

        //create the label and the button for the information (name and group)
        JButton showInformation = new JButton("Show my information");
        information = new JLabel();
        this.add(showInformation);
        this.add(information);

        //the action listener for the button
        showInformation.addActionListener(e -> showInformation());

        this.setVisible(true);

    }

    //the method for getting the name and the group from fields also this method set the color for the text
    public void showInformation() {
        String nameString = name.getText();
        String groupString = group.getText();
        String result = nameString + " " + groupString;
        information.setText(result);
        information.setForeground(new Color(122, 123, 129));

    }


}
