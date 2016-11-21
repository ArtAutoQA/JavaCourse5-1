package module4.questions;

/**
 * Created by citsym on 18.11.16.
 */
public class Car {

    private String color = "red";
    private int maxSpeed = 100;
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
