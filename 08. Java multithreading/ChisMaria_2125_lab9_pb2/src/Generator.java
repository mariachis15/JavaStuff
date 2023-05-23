public class Generator extends Thread{
    private NumbersContainer numbersContainer;

    public Generator(NumbersContainer numbersContainer) {
        this.numbersContainer = numbersContainer;
    }
    public void run() {
        for (int i = 0; i < 30; i++) {
            numbersContainer.addNewRandomNumber();
        }
    }
}
