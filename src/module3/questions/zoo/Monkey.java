package module3.questions.zoo;

/**
 * Created by citsym on 11.11.16.
 */
public class Monkey extends Mammal{


    public Monkey(){
        System.out.println("Monkey constructor");
    }


    @Override
    public void drinkMilk(int liters) {
        System.out.println(getClass().getSimpleName() + " drink" + liters);

    }

    @Override
    public void eat(int meal) {
        System.out.println(getClass().getCanonicalName() + " eat");
    }


}
