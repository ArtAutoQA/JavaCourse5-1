package module4.questions;

import java.io.Serializable;

/**
 * Created by citsym on 18.11.16.
 */
public class Car implements Serializable {

    public static  int carCount =6;

    private String color = "red";
    private transient int maxSpeed = 100;
    private int minSpeed = 0;
    private char state = 'A';


    private Engine engine;

    public Car() {
        engine = new Engine(100);
    }

    public Car(Engine engine){
        this.engine = engine;
    }

    public void wreckTheCar(){
        state = 'C';
    }

    public void driveToDestination(){
        engine.engineOn();

        // logic

    }


    public void driveToDestination(int miles){
        engine.engineOn();

        // logic

    }


    public void driveToDestination(int miles, int time){
        engine.engineOn();

        // logic

    }

//    @Override
//    public String toString() {
//        return getClass().getSimpleName() + " with Engine having " + engine.getHorsesPower() + " of horse power";
//    }


    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", state=" + state +
                ", minSpeed=" + minSpeed +
                ", maxSpeed=" + maxSpeed +
                '}';
    }


}
