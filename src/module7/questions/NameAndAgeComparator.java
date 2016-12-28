package module7.questions;

import module7.webinar.User;

import java.util.Comparator;

/**
 * Created by citsym on 09.12.16.
 */
public class NameAndAgeComparator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        if (o1.getName().compareTo(o2.getName()) == 0){
           return   o1.getAge() - o2.getAge();
        };

        return o1.getName().compareTo(o2.getName());
    }
}
