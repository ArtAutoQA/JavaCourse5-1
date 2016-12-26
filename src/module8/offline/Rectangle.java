package module8.offline;

import javafx.scene.effect.Light;

/**
 * Created by citsym on 26.12.16.
 */
public class Rectangle extends Shape {
    private final int width;
    private final int height;

    public Rectangle(Point point, int width, int height){
        super(point);

        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return width * height;
    }



    @Override
    public String toString() {
        return "Rectangle{" +
                super.toString() +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
