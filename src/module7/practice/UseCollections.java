package module7.practice;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by citsym on 12.12.16.
 */
public class UseCollections {

    public static void main(String[] args) {

        List<User> list = new LinkedList<>();

        long currentTimeBefore = System.currentTimeMillis();

        for (int i = 0; i < 10_000_000; i++) {
            list.add(0, new User(getRandomName(i), getRandomSecondName(i), i));
//            System.out.println(list.get(i));
        }

        long currentTimeAfter = System.currentTimeMillis();

        System.out.println(currentTimeAfter - currentTimeBefore);

        System.out.println("=========================================");

        Collections.sort(list, new NameAndSecondNameComparator());

        for (User user : list) {
//            System.out.println(user);
        }

        List<User> filteredList  = new ArrayList<>();

        for (User user : list) {
            if (user.getAge()>21) {
                filteredList.add(user);
            }
        }

        System.out.println("==========================================");
        for (User user : filteredList) {
//            System.out.println(user);
        }


        Collections.sort(filteredList);

        System.out.println("==========================================");
        for (User user : filteredList) {
//            System.out.println(user);
        }

    }

    private static String getRandomName(int i) {
        switch (i%3) {
            case 0:
                return "Vasya";
            case 1:
                return "Kolya";
            case 2:
                return "Petya";
            default:
                return "Masha";
        }

    }


    private static String getRandomSecondName(int i) {
        switch (i%3) {
            case 0:
                return "Ivanov";
            case 1:
                return "Petrov";
            case 2:
                return "Petrov";
            default:
                return "Ivanov";
        }

    }

    private static void businessLogicMethod(List list) {

        for (Object o : list) {
            if (o instanceof String){
                String str = (String) o;
                System.out.println(str.length());
            }
        }
    }
}
