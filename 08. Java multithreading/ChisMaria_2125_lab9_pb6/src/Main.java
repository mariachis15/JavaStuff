public class Main {
    public static void main(String[] args) {
        FileWrapper fileWrapper = new FileWrapper("file.txt");
        Writer writer = new Writer(fileWrapper, "hello world!");
        writer.start();
        Reader reader = new Reader(fileWrapper);
        reader.start();
    }
}
