import java.io.*;

public class FileWrapper {
    private File file;
    private boolean available = true;

    public FileWrapper(String name) {
        file = new File(name);
    }

    public synchronized void writeMessage(String message) throws InterruptedException, IOException {
        if (!available) {
            wait();
        }
        available = false;
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(message);
        fileWriter.close();
        available = true;
        notifyAll();
    }

    public synchronized void readMessage() throws InterruptedException, IOException {
        if (!available) {
            wait();
        }
        available = false;
        int ch;
        FileReader reader = new FileReader(file);
        while ((ch = reader.read()) != -1) {
            System.out.print((char) ch);
        }
        reader.close();
        available = true;
        notifyAll();
    }


}
