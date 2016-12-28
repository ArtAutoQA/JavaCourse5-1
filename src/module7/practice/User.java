package module7.practice;

/**
 * Created by citsym on 12.12.16.
 */
public class User implements Comparable<User> {

    private final String name;
    private final String secondName;
    private final int age;

    public User(String name, String secondName, int age) {

        this.name = name;
        this.secondName = secondName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(User o) {
        return getAge() - o.getAge();
    }
}
