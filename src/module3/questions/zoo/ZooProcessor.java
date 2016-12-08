package module3.questions.zoo;

/**
 * Created by citsym on 11.11.16.
 */
public class ZooProcessor {


    public static void main(String[] args) {
//        Elephant el = new Elephant();
//        Monkey monk = new Monkey();
//
//
//        el.play(monk);
//
//        monk.play(el);


//        Date newDate = new Date(116, 11, 11);
//
//        System.out.println(el.getDateOfBirth());
//
//        el.setDateOfBirth(newDate);
//
//        System.out.println(el.getDateOfBirth());
//
//        System.out.println("time " +newDate.getTime());

//        Calendar calendar = new GregorianCalendar();
//
//        calendar.set(2016, Calendar.NOVEMBER, 11);
//        Date newDate = calendar.getTime();// The same as code above with new Date()
//
//        el.setDateOfBirth(newDate);
//
//        System.out.println("BirthDate of El " +el.getDateOfBirth());


        // red gorilla breaks nut
        Gorilla gorRed = new Gorilla("red");
        gorRed.breakNut();

        System.out.println("Red gorilla has  " + gorRed.getNutsCount() + " nuts");


        Gorilla gorRed2 = new Gorilla("red");

//         green gorilla breaks nut
        gorRed2.breakNut();

        System.out.println("Green gorilla has  " + gorRed2.getNutsCount() + " nuts");


        System.out.println(gorRed2.equals(gorRed));
//        gorRed2.sleep();

    }
}
