package module6.webinar.statics;

public class EmployeeUser extends User {

    public EmployeeUser(String firstName, int age) {
        super(firstName, age);
    }

    @Override
    void gender() {
        System.out.println("override gender..");
    }
}
