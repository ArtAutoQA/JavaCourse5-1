package module7.questions;

import module7.webinar.User;

import java.util.Comparator;

/**
 * Created by citsym on 09.12.16.
 */
public class AgeComparator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        return o2.getAge() - o1.getAge();
    }
}
