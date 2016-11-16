package module3.practice;

/**
 * Created by citsym on 14.11.16.
 */
public class Triangle {

    private final boolean isPointsOnOneLine;

    double line1;
    double line2;
    double line3;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {

        isPointsOnOneLine = Double.compare((double) (x3 - x1) / (x2 - x1), (double) (y3 - y1) / (y2 - y1)) == 0;

        line1 = calculateLineLength(x1, y1, x2, y2);
        line2 = calculateLineLength(x2, y2, x3, y3);
        line3 = calculateLineLength(x1, y1, x3, y3);

    }

    private double calculateSquare() {

        double perimeter = calculatePerimeter();
        double halfOfPerimeter = perimeter / 2;

        // square is calculate with help of Heron Formula
        double square = Math.sqrt(halfOfPerimeter * (halfOfPerimeter - line1) * (halfOfPerimeter - line2) * (halfOfPerimeter - line3));

        return square;
    }

    private double calculatePerimeter() {

        return line1 + line2 + line3;
    }

    private double calculateLineLength(int x1, int y1, int x2, int y2) {

        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }

    public void print() {
        if (!isPointsOnOneLine) {
            System.out.println("Square is " + calculateSquare());
            System.out.println("Perimeter is " + calculatePerimeter());
        } else {
            System.out.println("ALL THE POINTS IN ONE LINE");
        }
    }

}
