package module3.questions.zoo;

/**
 * Created by citsym on 11.11.16.
 */
public abstract class Animal {

    public abstract void eat(int meal);

    public void sleep(){
        System.out.println(getClass().getSimpleName() + " sleep");
    };

    public void play(Animal animal){
            System.out.println(getClass().getSimpleName() + " play");
    };

}
