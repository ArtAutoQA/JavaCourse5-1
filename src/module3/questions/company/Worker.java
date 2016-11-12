package module3.questions.company;

import java.util.Arrays;

/**
 * Created by citsym on 11.11.16.
 */
public class Worker extends Employee implements Businessman, Friends {
    @Override
    public void goToMeeting(Businessman... workers) {
        System.out.println("Attend meeting with " + Arrays.toString(workers) );
    }

    @Override
    public void drinkBear(Friends... workers) {
        System.out.println("Drink with " + Arrays.toString(workers) );
    }
}
