import javax.swing.*;
import java.awt.*;

public class OnlineCourse extends JPanel {
    JTextField name;
    JTextField surname;
    JComboBox yearOfStudy;
    JComboBox faculty;
    JCheckBox financingTax;
    JCheckBox financingBudget;
    JComboBox course;
    JLabel information;

    OnlineCourse() {
        this.setLayout(new GridLayout(7, 2));
        this.setBackground(new Color(223, 240, 252));

        JLabel nameLabel = new JLabel("Enter your name: ");
        name = new JTextField();
        this.add(nameLabel);
        this.add(name);

        JLabel surnameLabel = new JLabel("Enter your surname: ");
        surname = new JTextField();
        this.add(surnameLabel);
        this.add(surname);

        JLabel yearOfStudyLabel = new JLabel("Select your year of study: ");
        yearOfStudy = new JComboBox(new String[]{"I", "II", "III", "IV"});
        this.add(yearOfStudyLabel);
        this.add(yearOfStudy);

        JLabel facultyLabel = new JLabel("Select your faculty: ");
        faculty = new JComboBox(new String[]{"AC", "ETTI"});
        this.add(facultyLabel);
        this.add(faculty);

        financingTax = new JCheckBox("tax");
        this.add(financingTax);
        financingBudget = new JCheckBox("budget");
        this.add(financingBudget);

        JLabel courseLabel = new JLabel("Select the course: ");
        course = new JComboBox(new String[]{"Python", "Java", "HTML", "C++", "C#", "JavaScript"});
        this.add(courseLabel);
        this.add(course);

        JButton signUp = new JButton("SIGN-UP");
        information = new JLabel();
        this.add(signUp);
        this.add(information);

        signUp.addActionListener(e -> signUp());

    }

    public void signUp() {
        String year = "";
        if (yearOfStudy.getItemAt(0) != null) {
            year = String.valueOf(yearOfStudy.getSelectedItem());
        } else if (yearOfStudy.getItemAt(1) != null) {
            year = String.valueOf(yearOfStudy.getSelectedItem());
        } else if (yearOfStudy.getItemAt(2) != null) {
            year = String.valueOf(yearOfStudy.getSelectedItem());
        } else if (yearOfStudy.getItemAt(3) != null) {
            year = String.valueOf(yearOfStudy.getSelectedItem());
        }

        String facultyChoice = " ";
        if (faculty.getItemAt(0) != null) {
            facultyChoice = String.valueOf(faculty.getSelectedItem());
        } else if (faculty.getItemAt(1) != null) {
            facultyChoice = String.valueOf(faculty.getSelectedItem());
        }

        String financing = " ";
        if (financingTax.isSelected()) {
            financing = String.valueOf(financingTax.getText());
        } else if (financingBudget.isSelected()) {
            financing = String.valueOf(financingBudget.getText());
        }

        String courseChoice = " ";
        if (course.getItemAt(0) != null) {
            courseChoice = String.valueOf(course.getSelectedItem());
        } else if (course.getItemAt(1) != null) {
            courseChoice = String.valueOf(course.getSelectedItem());
        } else if (course.getItemAt(2) != null) {
            courseChoice = String.valueOf(course.getSelectedItem());
        } else if (course.getItemAt(3) != null) {
            courseChoice = String.valueOf(course.getSelectedItem());
        } else if (course.getItemAt(4) != null) {
            courseChoice = String.valueOf(course.getSelectedItem());
        } else if (course.getItemAt(5) != null) {
            courseChoice = String.valueOf(course.getSelectedItem());
        }

        String result = name.getText() + " " + surname.getText() + " " + year + " " + facultyChoice + " " + financing + " " + courseChoice;
        information.setText(result);
        information.setForeground(Color.blue);

    }

}
