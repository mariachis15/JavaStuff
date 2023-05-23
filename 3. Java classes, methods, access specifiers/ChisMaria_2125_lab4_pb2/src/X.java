public class X {
    private char[] array;
    protected String object;
    int integer;

    public X(char[] array, String object, int integer) {
        this.array = array;
        this.object = object;
        this.integer = integer;
    }

    public char[] getArray() {
        return array;
    }

    public void setArray(char[] array) {
        this.array = array;
    }

    protected void finalize() {
        System.out.println("Finalize method is called.");
    }

}
