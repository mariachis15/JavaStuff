public class Position {
    private String namePoint;
    private int x, y, z;

    public Position(String namePoint, int x, int y, int z) {
        this.namePoint = namePoint;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Position() {
    }

    public boolean tooClosePosition(Position[] positions, int length) {
        for (int i = 0; i < length; i++) {
            if (Math.abs(positions[i].x - x) <= 1 || Math.abs(positions[i].x - x) <= 1 || Math.abs(positions[i].x - x) <= 1) {
                return true;
            }
        }
        return false;
    }

    public String getNamePoint() {
        return namePoint;
    }

    public void setNamePoint(String namePoint) {
        this.namePoint = namePoint;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "namePoint : " + namePoint + '\'' +
                ", x = " + x +
                ", y = " + y +
                ", z = " + z;
    }

}
