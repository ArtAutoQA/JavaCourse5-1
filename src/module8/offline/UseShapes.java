package module8.offline;

import java.util.List;
import java.util.Map;

/**
 * Created by citsym on 26.12.16.
 */
public class UseShapes {
    public static void main(String[] args) {
        int startX = 6;
        int startY = 7;
        Rectangle rectangle = new Rectangle(new Point(startX, startY), 14, 14);
        Rectangle rectangle1 = new Rectangle(new Point(0, 0), 45, 12);
        Rectangle rectangle2 = new Rectangle(new Point(5, 3), 14, 60);

        Circle circle = new Circle(new Point(4,5), 10);


        Group group = new Group();
        group.add(rectangle);
        group.add(rectangle1);
        group.add(rectangle2);
        group.add(circle);

//        group.getAll().forEach(System.out::println);

        List<Shape> all = group.getAll();

        for (Shape shape : all) {
            System.out.println(shape);
        }


        System.out.println("AREA = " + group.getSumArea());

        Map<Class<? extends Shape>, Group> classGroupMap = group.shapesSeparatedByType();

        Group circlesGroup = classGroupMap.get(Circle.class);


        System.out.println("=========================== Circles");
        circlesGroup.getAll().forEach(System.out::println);

        System.out.println("=========================== Rectangles ");
        group.shapesSeparatedByType(Rectangle.class).getAll().forEach(System.out::println);


        System.out.println("abcC".compareTo("abcDfff"));


    }
}
