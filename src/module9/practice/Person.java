package module9.practice;

/**
 * Created by citsym on 13.01.17.
 */
public class Person {
    private final String name;
    private final String secondNAme;
    private final String email;

    public Person(String name, String secondNAme, String email) {

        this.name = name;
        this.secondNAme = secondNAme;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getSecondNAme() {
        return secondNAme;
    }

    public String getEmail() {
        return email;
    }
}
