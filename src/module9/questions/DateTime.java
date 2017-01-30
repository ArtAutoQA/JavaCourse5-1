package module9.questions;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

/**
 * Created by citsym on 16.01.17.
 */
public class DateTime {

    public static void main(String[] args) {
        Temporal t1 = Clock.systemUTC().instant();
        Temporal t2 = t1.plus(1, ChronoUnit.DAYS);

       if (Duration.ofDays(1).getSeconds() ==
                t2.getLong(ChronoField.INSTANT_SECONDS) - t1.getLong(ChronoField.INSTANT_SECONDS)) {
           System.out.println("equals");
           System.out.println(Duration.ofDays(1));
       };

        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1960, Month.JANUARY, 1);

        Period p = Period.between(birthday, today);
        long p2 = ChronoUnit.DAYS.between(birthday, today);
        System.out.println("You are " + p.getYears() + " years, " + p.getMonths() +
                " months, and " + p.getDays() +
                " days old. (" + p2 + " days total)");
    }
}
