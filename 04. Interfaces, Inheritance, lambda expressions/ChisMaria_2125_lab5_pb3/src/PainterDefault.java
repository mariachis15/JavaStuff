public class PainterDefault implements Paint {

    public double getPaintQuantity(SpatialShape spatialShape) {
        double surface = spatialShape.surface();
        return Paint.paintOnTheSurfaceUnit * surface;
    }
}
