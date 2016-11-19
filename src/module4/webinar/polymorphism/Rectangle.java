package module4.webinar.polymorphism;

public class Rectangle extends Figure {
    int a;
    int b;

    @Override
    void drawFigure() {
        System.out.println("Drawing rectabgle...");
    }

    @Override
    int calcPerimiter() {
        return super.calcPerimiter();
    }
}
