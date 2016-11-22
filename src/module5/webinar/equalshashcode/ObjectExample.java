package module5.webinar.equalshashcode;

import java.util.HashSet;
import java.util.Set;

public class ObjectExample {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        //e1.setFirstname("Test");
        //System.out.println(e1.toString());

        //String employee = e1.toString();

        e1.setFirstname("Test");
        e2.setFirstname("Test");

        e1.setLastName("Test1");
        e2.setLastName("Test1");

        System.out.println(e1);
        System.out.println(e2);

        System.out.println(e1.equals(e2));

        Employee e3 = e1;

        System.out.println(e1.equals(e3));

        //----------------------------------------------
        Set<Employee> set = new HashSet<>();
        set.add(e1);
        set.add(e2);

        System.out.println(set);
    }
}
