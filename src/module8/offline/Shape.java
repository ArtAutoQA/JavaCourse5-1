package module8.offline;

/**
 * Created by citsym on 26.12.16.
 */
public abstract class Shape {

    private Point startPoint;

    public abstract double getArea() ;


    public Shape(Point point) {
        this.startPoint = point;
    }

    @Override
    public String toString() {
        return  "start" + startPoint;
    }
}
