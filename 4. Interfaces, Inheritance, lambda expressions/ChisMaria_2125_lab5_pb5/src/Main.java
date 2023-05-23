import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Ioana");
        strings.add("Maria");
        strings.add("Eusebiu");
        strings.add("Alexandru");
        strings.add("Raluca");
        strings.add("Antonia");
        strings.add("Ana");
        strings.add("Mihai");

        strings.sort((String s1, String s2) -> {
            if (s1.length() < s2.length()) {
                return -1;
            } else if (s1.length() > s2.length()) {
                return 1;
            } else {
                return s1.compareTo(s2);
            }
        });
        for (String str : strings) {
            System.out.println(str);
        }
        System.out.println();

        strings.sort((String s1, String s2) -> {
            if (s1.length() < s2.length()) {
                return 1;
            } else if (s1.length() > s2.length()) {
                return -1;
            } else {
                return s1.compareTo(s2);
            }
        });
        for (String str : strings) {
            System.out.println(str);
        }
        System.out.println();

        strings.sort((String s1, String s2) -> {
            return s1.compareTo(s2);
        });
        for (String str : strings) {
            System.out.println(str);
        }
        System.out.println();


        strings.sort((String s1, String s2) -> {
            if (s1.charAt(0) == 'M' && s2.charAt(0) != 'M') {
                return -1;
            } else if (s1.charAt(0) != 'M' && s2.charAt(0) == 'M') {
                return 1;
            } else {
                return s1.compareTo(s2);
            }
        });
        for (String str : strings) {
            System.out.println(str);
        }
    }

}
