import java.io.IOException;

public class Reader extends Thread {
    private FileWrapper fileWrapper;

    public Reader(FileWrapper fileWrapper) {
        this.fileWrapper = fileWrapper;
    }

    public void run() {
        try {
            fileWrapper.readMessage();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
