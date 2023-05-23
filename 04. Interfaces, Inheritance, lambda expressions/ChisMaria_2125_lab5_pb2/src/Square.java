public class Square implements GeometricShape {
    // l is the side of the square

    public double surface(int l) {
        return l * l;
    }

    public double perimeter(int l) {
        return l + l;
    }
}
