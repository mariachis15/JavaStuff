public class DoubleVariable implements Generator<Double> {
    public Double next(Double var) {
        return ++var;
    }

    public DoubleVariable() {

    }
}
