package module3.questions.zoo;

import java.util.Date;

/**
 * Created by citsym on 11.11.16.
 */
public class Elephant extends Mammal {

    Date dateOfBirth;

    public Elephant(){
        dateOfBirth = new Date();
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public void drinkMilk(int liters) {
        System.out.println("Elephant drink" + liters);

    }

    @Override
    public void eat(int meal) {
        System.out.println(getClass().getCanonicalName() + " eat");
    }

    @Override
    public void sleep() {
        System.out.println(getClass().getCanonicalName() + " sleep");
    }

    @Override
    public void play(Animal animal) {
        System.out.println(getClass().getSimpleName() + " play");
    }
}
