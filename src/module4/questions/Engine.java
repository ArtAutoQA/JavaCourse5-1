package module4.questions;

/**
 * Created by citsym on 18.11.16.
 */
public class Engine {

    private boolean engineOn = false;
    private int horsesPower;

    public Engine(int horsesPower){
        this.horsesPower = horsesPower;
    }

    public void engineOn(){
        engineOn = true;

    }

    public  void  engineOff(){
        engineOn = false;
    }


    public boolean isEngineOn() {
        return engineOn;
    }


    public int getHorsesPower() {
        return horsesPower;
    }


    @Override
    public String toString() {
        return "Engine{" +
                "engineOn=" + engineOn +
                ", horsesPower=" + horsesPower +
                '}';
    }
}
