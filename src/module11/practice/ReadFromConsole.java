package module11.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by citsym on 20.01.17.
 */
public class ReadFromConsole {
    public static void main(String[] args) {


//        try{
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//            System.out.println(bufferedReader.readLine());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        List<Integer> intList = new ArrayList<>();
        List<Double> doubleList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();


        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    intList.add(scanner.nextInt());
                    scanner.nextLine();

                } else {
                    String line = scanner.nextLine();

                    try {
                        Double value = Double.parseDouble(line);
                        doubleList.add(value);
                    } catch (NumberFormatException e) {
                        if (line.equalsIgnoreCase("q")){
                            break;
                        }
                        stringList.add(line);
                    }


                }

            }
        }
//

        System.out.println("============== Int");
        intList.forEach(System.out::println);
        System.out.println("============== Double");
        doubleList.forEach(System.out::println);
        System.out.println("============== String");
        stringList.forEach(System.out::println);


    }
}
