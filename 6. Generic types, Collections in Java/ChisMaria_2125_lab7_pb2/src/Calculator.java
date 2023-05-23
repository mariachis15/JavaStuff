
public class Calculator {
    public <N extends Object> N addition(N num1, N num2) {
        if (num1 instanceof Integer) {
            return (N) Integer.valueOf(((Integer) num1).intValue() + ((Integer) num2).intValue());
        } else if (num1 instanceof Double) {
            return (N) Double.valueOf(((Double) num1).doubleValue() + ((Double) num2).doubleValue());
        } else if (num1 instanceof String) {
            return (N) String.valueOf(((String) num1).concat((String) num2));
        } else throw new IllegalArgumentException("This type of arguments can not be calculated.");
    }

    public <N extends Object> N subtraction(N num1, N num2) {
        if (num1 instanceof Integer) {
            return (N) Integer.valueOf(((Integer) num1).intValue() - ((Integer) num2).intValue());
        } else if (num1 instanceof Double) {
            return (N) Double.valueOf(((Double) num1).doubleValue() - ((Double) num2).doubleValue());
        } else if (num1 instanceof String && ((String) num1).length() == ((String) num2).length()) {
            String str1 = (String) num1;
            String str2 = (String) num2;
            StringBuilder result = new StringBuilder(str1);
            for (int i = 0; i < str1.length(); i++) {
                result.setCharAt(i, (char) (Math.abs(str1.charAt(i) - str2.charAt(i))));
            }
            return (N) String.valueOf(result);
        }
        throw new IllegalArgumentException("This type of arguments can not be calculated.");
    }

    public <N extends Object> N multiply(N num1, N num2) {
        if (num1 instanceof Integer) {
            return (N) Integer.valueOf(((Integer) num1).intValue() * ((Integer) num2).intValue());
        } else if (num1 instanceof Double) {
            return (N) Double.valueOf(((Double) num1).doubleValue() * ((Double) num2).doubleValue());
        } else throw new IllegalArgumentException("This type of arguments can not be calculated.");
    }

    public <N extends Object> N divide(N num1, N num2) {
        if (num1 instanceof Integer) {
            return (N) Integer.valueOf(((Integer) num1).intValue() / ((Integer) num2).intValue());
        } else if (num1 instanceof Double) {
            return (N) Double.valueOf(((Double) num1).doubleValue() / ((Double) num2).doubleValue());
        } else throw new IllegalArgumentException("This type of arguments can not be calculated.");
    }
}
