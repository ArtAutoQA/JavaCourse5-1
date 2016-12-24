package module7.questions;

import module7.webinar.User;

import java.util.*;
import java.util.ArrayList;

/**
 * Created by citsym on 09.12.16.
 */
public class UseComparable {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();

        list.add(new User("Vasya", 10));
        list.add(new User("Kolya", 30));
        list.add(new User("Kolya", 12));
        list.add(new User("Olya", 10));
        list.add(new User("Olya", 18));
        list.add(new User("Petya", 15));


        Collections.sort(list, new AgeComparator());

        System.out.println(list);


        Collections.sort(list, new NameComparator());

        System.out.println(list);

        list.sort(new NameAndAgeComparator());

        System.out.println(list);


        list.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.hashCode() - o2.hashCode();
            }
        });

        System.out.println(list);

    }
}
