import java.io.IOException;

public class Writer extends Thread {
    private FileWrapper fileWrapper;
    private String message;

    public Writer(FileWrapper fileWrapper, String message) {
        this.message = message;
        this.fileWrapper = fileWrapper;
    }

    public void run() {
        try {
            fileWrapper.writeMessage(message);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
