public class IntegerVariable implements Generator<Integer> {
    public Integer next(Integer var) {
        return ++var;
    }

    public IntegerVariable() {

    }
}
