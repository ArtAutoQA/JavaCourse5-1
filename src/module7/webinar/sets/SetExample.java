package module7.webinar.sets;


import module7.webinar.User;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("item");
        set.add("item1");
        set.add("item");
        set.add("item");
        set.add("item");
        set.add("item");
        set.add("item");
        set.add("item");
        set.add("item");

        System.out.println(set);


        for(String item : set)
            System.out.println(item);





        Set<User> users = new HashSet<>();
        users.add(new User("Denis", 14341));
        users.add(new User("Denis", 2434144));
        users.add(new User("Denis", 11034343));

        System.out.println(users);
    }
}
