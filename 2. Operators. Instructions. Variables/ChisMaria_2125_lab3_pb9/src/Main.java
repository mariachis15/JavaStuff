import java.util.Random;

public class Main {
    public static String[] getInitializedArray() {
        String[] cards = new String[52];
        int index = 0;
        for (int i = 2; i < 15; i++) {
            String value = String.valueOf(i);
            if (i < 10) {
                value = '0' + value;
            }
            cards[index++] = "red heart = " + value;
        }
        for (int i = 2; i < 15; i++) {
            String value = String.valueOf(i);
            if (i < 10) {
                value = '0' + value;
            }
            cards[index++] = "black heart = " + value;
        }
        for (int i = 2; i < 15; i++) {
            String value = String.valueOf(i);
            if (i < 10) {
                value = '0' + value;
            }
            cards[index++] = "black spade = " + value;
        }
        for (int i = 2; i < 15; i++) {
            String value = String.valueOf(i);
            if (i < 10) {
                value = '0' + value;
            }
            cards[index++] = "red diamond = " + value;
        }
        return cards;
    }

    public static int getNumber(String sb) {
        if (sb.charAt(0) == '0') {
            return Integer.parseInt(String.valueOf((sb.charAt(1))));
        } else {
            return Integer.parseInt(sb);
        }
    }

    public static String[] deleteCard(String[] cards, String card, int length) {
        int index = 0;
        String[] newArray = new String[length];
        for (int i = 0; i < length; i++) {
            if (cards[i].equals(card) == false) {
                newArray[index++] = cards[i];
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        String[] cards = getInitializedArray();
        Random rand = new Random();
        int nrCards = 52;
        int extractedCards = 0;
        while (true) {
            if (nrCards == 0) {
                System.out.println("UNLUCKY");
                break;
            }
            int pos = rand.nextInt(nrCards);
            StringBuilder sb = new StringBuilder(cards[pos]);
            if (sb.substring(0, 11).equals("black spade") && getNumber(sb.substring(sb.length() - 2, sb.length())) > 8) {
                System.out.println("Succes!");
                break;
            } else {
                System.out.println(cards[pos]);
                System.out.println("extracted cards: " + ++extractedCards);
                cards = deleteCard(cards, cards[pos], nrCards);
                nrCards--;
            }
        }

    }
}
