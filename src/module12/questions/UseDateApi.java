package module12.questions;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

/**
 * Created by citsym on 30.01.17.
 */
public class UseDateApi {

    public static void main(String[] args) {

        Date now = new Date();

        someMethod(now);


        // now is unpredictable


        // LocalDateTime

        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDateTime.toString());


        LocalDate localDate = LocalDate.now();

        System.out.println(localDate.toString());


        LocalTime localTime = LocalTime.now();

        System.out.println(localTime.toString());


        System.out.println(localTime.getNano());


        Clock clock = Clock.systemDefaultZone();

        LocalDateTime localDateTime1 = LocalDateTime.now(clock);

        ZoneId zoneId = ZoneId.of("America/Chicago");

        LocalDateTime localDate1 = LocalDateTime.now(zoneId);


        System.out.println(localDate1 + " With timezone");


        // Creating of local date time


        LocalDateTime  localDateTime3 = LocalDateTime.of( Year.now().getValue(), Month.FEBRUARY, DayOfWeek.SATURDAY.getValue(), 1, 1, 1 );

        System.out.println(localDateTime3.isAfter(localDateTime1));

        System.out.println(localDateTime3);

        LocalDateTime result = localDateTime3.withDayOfMonth(13);

        System.out.println(localDateTime3);

        System.out.println(result);

        System.out.println(localDateTime3.plus(15, ChronoUnit.WEEKS));


        LocalDate adjusted = localDate.with( TemporalAdjusters.dayOfWeekInMonth(3, DayOfWeek.SATURDAY));

        System.out.println(adjusted);


        LocalDate adjusted2 = localDate.with( TemporalAdjusters.next(DayOfWeek.SUNDAY));


        System.out.println(adjusted2);


        Period period = Period.of( 3, 2, 1 );


        System.out.println(localDate.plus(period));


        Duration duration = Duration.between(localDateTime, localDateTime3);


        System.out.println("between " + duration.getSeconds());
//        System.out.println("between " + duration.get(ChronoUnit.DAYS));


        System.out.println(localDate.format(DateTimeFormatter.ofPattern("yyyy/MM/dd")));

        LocalDate localDate3 = LocalDate.parse("2020.06.17",  DateTimeFormatter.ofPattern("yyyy.MM.dd"));

        System.out.println(localDate3);

    }

    private static void someMethod(Date now) {
        now.setTime(100000);
    }
}
