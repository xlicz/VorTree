import java.util.Arrays;

public class Point {
    private double[] coordinates;

    public Point(int dim) {
        coordinates = new double[dim];
    }

    public Point(double[] coordinates) {
        this.coordinates = coordinates;
    }

    public double get(int i) {
        return coordinates[i];
    }

    public void set(int i, double val) {
        coordinates[i] = val;
    }

    public int dim() {
        return coordinates.length;
    }

    public double distanceTo(final Point other) {
        double result = 0.0;
        for (int i = 0; i < dim(); ++i) {
            result += Math.pow(get(i) - other.get(i), 2);
        }
        return Math.sqrt(result);
    }

    public Point min(final Point other) {
        Point result = new Point(dim());
        for (int i = 0; i < dim(); ++i) {
            result.set(i, Math.min(get(i), other.get(i)));
        }
        return result;
    }

    public Point max(final Point other) {
        Point result = new Point(dim());
        for (int i = 0; i < dim(); ++i) {
            result.set(i, Math.max(get(i), other.get(i)));
        }
        return result;
    }

    public double getX() {
        if (dim() > 0) {
            return get(0);
        }
        return 0;
    }

    public double getY() {
        if (dim() > 1) {
            return get(1);
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Point(" +
                "coordinates = " + Arrays.toString(coordinates) +
                ')';
    }
}
