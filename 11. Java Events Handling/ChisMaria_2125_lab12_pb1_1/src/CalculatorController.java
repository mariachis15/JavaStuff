import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorController implements ActionListener {
    CalculatorView calculatorView = new CalculatorView();
    double number1 = 0;
    double number2 = 0;
    double result = 0;
    int calculation = 0;

    CalculatorController() {
        addActionEvent();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == calculatorView.buttonOne) {
            calculatorView.inputField.setText(calculatorView.inputField.getText() + "1");
        } else if (source == calculatorView.buttonClear) {
            calculatorView.outputField.setText("");
            calculatorView.inputField.setText("");
        } else if (source == calculatorView.buttonTwo) {
            calculatorView.inputField.setText(calculatorView.inputField.getText() + "2");
        } else if (source == calculatorView.buttonThree) {
            calculatorView.inputField.setText(calculatorView.inputField.getText() + "3");
        } else if (source == calculatorView.buttonFour) {
            calculatorView.inputField.setText(calculatorView.inputField.getText() + "4");
        } else if (source == calculatorView.buttonFive) {
            calculatorView.inputField.setText(calculatorView.inputField.getText() + "5");
        } else if (source == calculatorView.buttonSix) {
            calculatorView.inputField.setText(calculatorView.inputField.getText() + "6");
        } else if (source == calculatorView.buttonSeven) {
            calculatorView.inputField.setText(calculatorView.inputField.getText() + "7");
        } else if (source == calculatorView.buttonEight) {
            calculatorView.inputField.setText(calculatorView.inputField.getText() + "8");
        } else if (source == calculatorView.buttonNine) {
            calculatorView.inputField.setText(calculatorView.inputField.getText() + "9");
        } else if (source == calculatorView.buttonZero) {
            if (calculatorView.inputField.getText().equals("0")) {
                return;
            } else {
                calculatorView.inputField.setText(calculatorView.inputField.getText() + "0");
            }
        } else if (source == calculatorView.buttonDot) {
            if (calculatorView.inputField.getText().contains(".")) {
                return;
            } else {
                calculatorView.inputField.setText(calculatorView.inputField.getText() + ".");
            }
        } else if (source == calculatorView.buttonPlus) {
            String str = calculatorView.inputField.getText();
            number1 = Double.parseDouble(calculatorView.inputField.getText());
            calculation = 1;
            calculatorView.inputField.setText("");
            calculatorView.outputField.setText(str + "+");

        } else if (source == calculatorView.buttonMinus) {
            String str = calculatorView.inputField.getText();
            number1 = Double.parseDouble(calculatorView.inputField.getText());
            calculation = 2;
            calculatorView.inputField.setText("");
            calculatorView.outputField.setText(str + "-");

        } else if (source == calculatorView.buttonMul) {
            String str = calculatorView.inputField.getText();
            number1 = Double.parseDouble(calculatorView.inputField.getText());
            calculation = 3;
            calculatorView.inputField.setText("");
            calculatorView.outputField.setText(str + "X");

        } else if (source == calculatorView.buttonDiv) {
            String str = calculatorView.inputField.getText();
            number1 = Double.parseDouble(calculatorView.inputField.getText());
            calculation = 4;
            calculatorView.inputField.setText("");
            calculatorView.outputField.setText(str + "/");

        } else if (source == calculatorView.buttonEqual) {
            number2 = Double.parseDouble(calculatorView.inputField.getText());
            switch (calculation) {
                case 1:
                    result = number1 + number2;
                    break;
                case 2:
                    result = number1 - number2;
                    break;
                case 3:
                    result = number1 * number2;
                    break;
                case 4:
                    result = number1 / number2;
                    break;
            }
            calculatorView.inputField.setText(Double.toString(result));
            calculatorView.outputField.setText("");

        }
        number1 = result;

    }

    public void addActionEvent() {
        calculatorView.buttonOne.addActionListener(this);
        calculatorView.buttonTwo.addActionListener(this);
        calculatorView.buttonThree.addActionListener(this);
        calculatorView.buttonFour.addActionListener(this);
        calculatorView.buttonFive.addActionListener(this);
        calculatorView.buttonSix.addActionListener(this);
        calculatorView.buttonSeven.addActionListener(this);
        calculatorView.buttonEight.addActionListener(this);
        calculatorView.buttonNine.addActionListener(this);
        calculatorView.buttonPlus.addActionListener(this);
        calculatorView.buttonMinus.addActionListener(this);
        calculatorView.buttonMul.addActionListener(this);
        calculatorView.buttonDiv.addActionListener(this);
        calculatorView.buttonDot.addActionListener(this);
        calculatorView.buttonZero.addActionListener(this);
        calculatorView.buttonClear.addActionListener(this);
        calculatorView.buttonEqual.addActionListener(this);
    }
}
