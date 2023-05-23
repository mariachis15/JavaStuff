
public class Calculator extends Thread {
    private NumbersContainer numbersContainer;

    public Calculator(NumbersContainer numbersContainer) {
        this.numbersContainer = numbersContainer;
    }

    public void run() {
        for (int i = 0; i < 30; i++) {
            numbersContainer.showCircleSurface();
        }
    }
}
