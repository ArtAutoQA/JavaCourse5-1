package module3.questions.zoo;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by citsym on 11.11.16.
 */
public class ZooProcessor {

    public static void main(String[] args) {
        Elephant el = new Elephant();
        Monkey monk = new Monkey();


        el.play(monk);

        monk.play(el);

        Gorilla gorRed = new Gorilla("red");

//        Date newDate = new Date(116, 11, 11);
//
//        System.out.println(el.getDateOfBirth());
//
//        el.setDateOfBirth(newDate);
//
//        System.out.println(el.getDateOfBirth());
//
//        System.out.println("time " +newDate.getTime());

        Calendar calendar = new GregorianCalendar();

        calendar.set(2016, Calendar.NOVEMBER, 11);
        Date newDate = calendar.getTime();// The same as code above with new Date()

        el.setDateOfBirth(newDate);

        System.out.println("BirthDate of El " +el.getDateOfBirth());


        // red gorilla breaks nut
        gorRed.breakNut();

        System.out.println("Nuts left in the zoo " + gorRed.getNutsCount());


        Gorilla gorGreen = new Gorilla("green");

        // green gorilla breaks nut
        gorGreen.breakNut();

        System.out.println("Nuts left in the zoo " + gorGreen.getNutsCount());

        gorGreen.sleep();

    }
}
