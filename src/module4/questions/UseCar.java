package module4.questions;

/**
 * Created by citsym on 18.11.16.
 */
public class UseCar {
    public static void main(String[] args) {

        int counter = 10;  // 0000 0000 0000 0000 0000 0000 0000 1010

        int counter2  = 2; // 0000 0000 0000 0000 0000 0000 0000 0010


        counter2 = counter; // counter2: 0000 0000 0000 0000 0000 0000 0000 1010

        counter2 += 1; // counter2: 0000 0000 0000 0000 0000 0000 0000 1011


        System.out.println(counter);
        System.out.println(counter2);

        Car familyCar = new Car();   // 0100 0100 0100 1100 0000 0000 0000 1010


        familyCar.driveToDestination(10, 400);

        System.out.println(familyCar);

        Car aliceCar = familyCar;

        aliceCar.wreckTheCar();


        System.out.println(aliceCar);
        System.out.println(familyCar);



        Object someObject = aliceCar;



        someObjectToString(someObject);

    }

    private static void someObjectToString(Object someObject) {

        String toStringVl = someObject.toString();

        System.out.println(toStringVl);
    }

}
