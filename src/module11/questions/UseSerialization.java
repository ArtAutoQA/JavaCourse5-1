package module11.questions;

import module4.questions.Car;

import java.io.*;

import static module11.questions.RandomAccessFileUsage.USERS_CITSYM_DESKTOP;

/**
 * Created by citsym on 23.01.17.
 */
public class UseSerialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Car car  = new Car();

        Car.carCount = 0;

        System.out.println("Color: " + car.getColor());

        car.setColor("Blue");
        car.setMaxSpeed(10000);

        System.out.println("Color: " + car.getColor());


        FileOutputStream fos = new FileOutputStream(USERS_CITSYM_DESKTOP+"blueCarObject.txt");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(car);


        System.out.println("=============");


        Car blueCar = readObjFromFile(USERS_CITSYM_DESKTOP + "blueCarObject.txt");

        Car.carCount = 10;

        Car blueCar2 = readObjFromFile(USERS_CITSYM_DESKTOP + "blueCarObject.txt");


        System.out.println("Color of cloned car: " + blueCar.getColor());
        System.out.println("Color of cloned car: " + blueCar2.getColor());
        System.out.println("Maxspeed of cloned car: " + blueCar2.getMaxSpeed());
        System.out.println(blueCar2.carCount);



    }

    private static Car readObjFromFile(String s) throws IOException, ClassNotFoundException {
        FileInputStream fin = new FileInputStream(USERS_CITSYM_DESKTOP + "blueCarObject.txt");

        ObjectInputStream ois = new ObjectInputStream(fin);

        Car car = (Car) ois.readObject();

        ois.close();
        return car;
    }
}
