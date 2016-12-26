package module8.offline;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by citsym on 26.12.16.
 */
public class Group {

    private List<Shape> listShapes = new ArrayList<>();

    public void add(Shape shape) {
        listShapes.add(shape);
    }

    public List<Shape> getAll(){
        return listShapes;
    }

    public boolean isEmpty(){
       return listShapes.isEmpty();
    }

    public int size(){
        return listShapes.size();
    }

    public void addAll(Group groupToAdd){
        listShapes.addAll(groupToAdd.getAll());
    }

    public double getSumArea(){
        double sum = 0;
        for (Shape listShape : listShapes) {
            sum += listShape.getArea();
        }
        return new BigDecimal(sum).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public Map<Class<? extends Shape>, Group> shapesSeparatedByType(){
        Map<Class<? extends Shape>, Group> map = new HashMap<>();

        for (Shape shape : listShapes) {

            Class<? extends Shape> aClass = shape.getClass();
            if (map.get(aClass) == null){
                map.put(aClass, new Group());
                map.get(aClass).add(shape);
            } else {
                map.get(aClass).add(shape);
            }

        }


        return map;
    }

    public <T extends Shape> Group shapesSeparatedByType(Class<T> clazz){

        return null;
    }




}
