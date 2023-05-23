public class SetterGetter<T> {
    private T attribute;

    public void setAttribute(T attribute) {
        this.attribute = attribute;
    }

    public T getAttribute() {
        return attribute;
    }

}
