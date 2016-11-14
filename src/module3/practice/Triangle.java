package module3.practice;

/**
 * Created by citsym on 14.11.16.
 */
public class Triangle {

    private final int x1;
    private final int y1;
    private final int x2;
    private final int y2;
    private final int x3;
    private final int y3;
    private final boolean isPointsOnOneLine;

    double line1;
    double line2;
    double line3;

    private  double square;

    public Triangle(int x1,int y1, int x2,int y2,int x3,int y3){

        isPointsOnOneLine = (x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1);
        if (isPointsOnOneLine){
            System.out.println("ALL THE POINTS IN ONE LINE");
        }

        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;


        line1 = calculateLine(x1,y1, x2, y2);
        line2 = calculateLine(x2,y2, x3, y3);
        line3 = calculateLine(x1,y1, x3, y3);


    };
    
    private double calculateSquare(){

        double perimeter  = calculatePerimeter();
        double halfOfPerimeter = perimeter/2;

        // square is calculate with help of Heron Formula
        square = Math.sqrt(halfOfPerimeter * (halfOfPerimeter-line1) * (halfOfPerimeter - line2) * (halfOfPerimeter - line3));

        return square;
    }

    private double calculateLine(int x1, int y1, int x2, int y2) {

        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }

    private double calculatePerimeter() {

        return line1 + line2 + line3;
    }

    public void print() {
        if (!isPointsOnOneLine) {
            System.out.println("Square is " + calculateSquare());

            System.out.println("Perimeter is " + calculatePerimeter());
        }
    }

}
