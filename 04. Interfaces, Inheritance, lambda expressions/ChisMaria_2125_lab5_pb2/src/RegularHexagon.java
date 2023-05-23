public class RegularHexagon implements GeometricShape {
    // l is the side of the hexagon
    public double surface(int l) {
        return 6 * ((Math.pow(l, 2) * Math.sqrt(3)) / 4);
    }

    public double perimeter(int l) {
        return l * 6;
    }
}
