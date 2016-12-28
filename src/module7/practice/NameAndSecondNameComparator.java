package module7.practice;

import java.util.Comparator;

/**
 * Created by citsym on 12.12.16.
 */
public class NameAndSecondNameComparator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {

        if (o1.getSecondName().compareTo(o2.getSecondName()) == 0) {
            return o1.getName().compareTo(o2.getName());
        }


        return o1.getSecondName().compareTo(o2.getSecondName());
    }
}
