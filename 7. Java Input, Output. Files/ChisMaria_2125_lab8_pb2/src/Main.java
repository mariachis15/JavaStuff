import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        final int newLine = '\n';
        BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));
        StreamTokenizer streamTokenizer = new StreamTokenizer(bufferedReader);
        List<Object> tokens = new ArrayList<>();
        streamTokenizer.ordinaryChar('\n');
        int currentToken = streamTokenizer.nextToken();
        while (true) {
            if (currentToken == StreamTokenizer.TT_WORD) {
                tokens.add(streamTokenizer.sval);
                currentToken = streamTokenizer.nextToken();
                if (currentToken == StreamTokenizer.TT_NUMBER) {
                    tokens.add(streamTokenizer.nval);
                } else {
                    break;
                }
            } else {
                break;
            }
            if (currentToken == newLine) {
                break;
            }
            currentToken = streamTokenizer.nextToken();
        }
        for (Object object : tokens) {
            System.out.println(object);
        }
    }

}
