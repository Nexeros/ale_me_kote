import java.util.Objects;

public class ImmutablePoint {
    final int x;
    final int y;
    final int z;
    public ImmutablePoint(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutablePoint that = (ImmutablePoint) o;
        return x == that.x && y == that.y && z == that.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    @Override
    public String toString() {
        return "ImmutablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
