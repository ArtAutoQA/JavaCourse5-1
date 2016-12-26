package module8.offline;

/**
 * Created by citsym on 26.12.16.
 */
public class Circle extends Shape{

    private final int radius;

    public Circle(Point point, int radius) {
        super(point);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                super.toString() +
                ", radius=" + radius +
                '}';
    }
}
