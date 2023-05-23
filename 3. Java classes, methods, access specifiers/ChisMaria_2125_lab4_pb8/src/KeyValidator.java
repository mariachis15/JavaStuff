public class KeyValidator {
    public boolean verifyGroup(String key) {
        int counter = 0;
        for (int i = 0; i < key.length(); i++) {
            if (key.charAt(i) == '-') {
                counter++;
            }
        }
        if (counter != 3) {
            return false;
        }
        String[] parts = key.split("-");
        for (int i = 0; i < 4; i++) {
            if (parts[i].length() != 5 || !allAlphaNumericCharacters(parts[i])) {
                return false;
            }
        }
        return true;
    }

    public boolean checkValidLettersAndDigits(String key) {
        int letter = 0;
        int digit = 0;
        for (int i = 0; i < key.length(); i++) {
            if (key.charAt(i) >= '0' && key.charAt(i) <= '9') {
                digit++;
            }

            if ((key.charAt(i) >= 'a' && key.charAt(i) <= 'z') || (key.charAt(i) >= 'A' && key.charAt(i) <= 'Z')) {
                letter++;
            }
        }
        if (digit < letter) {
            return false;
        }
        return true;

    }

    private boolean allAlphaNumericCharacters(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') ||
                    (str.charAt(i) >= '0' && str.charAt(i) <= '9'))) {
                return false;
            }
        }
        return true;
    }
}
