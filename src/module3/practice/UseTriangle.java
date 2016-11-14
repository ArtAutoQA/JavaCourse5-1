package module3.practice;

/**
 * Created by citsym on 14.11.16.
 */
public class UseTriangle {
    public static void main(String[] args) {
        System.out.println("======== Triangle 1 =======");
        Triangle triangle = new Triangle(1, 2, 10, 4, 5, 6);

        triangle.print();

        System.out.println();
        System.out.println("======== Triangle 2 =======");

        Triangle triangle2 = new Triangle(1, 2, 3, 4, 5, 6);

        triangle2.print();
    }
}
