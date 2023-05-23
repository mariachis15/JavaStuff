public class EquilateralTriangle implements GeometricShape {
    // l is the side of the triangle
    public double surface(int l) {
        return (Math.pow(l, 2) * Math.sqrt(3)) / 4;
    }

    public double perimeter(int l) {
        return l * 3;
    }
}
