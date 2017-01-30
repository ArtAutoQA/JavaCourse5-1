package module5.practice.singleton;

import com.sun.tools.javac.util.StringUtils;

/**
 * Created by citsym on 28.11.16.
 */
public class UseConnection {

    public static void main(String[] args) {

        String line = "   Some Line   ";
        System.out.println(StringUtils.toLowerCase(line));

        adminUserCreation();

        businessUserCreation();
    }

    private static void adminUserCreation() {
        User petya = new User(2, "Petya");
        petya.setConnection(Connection.getInstance());

    }

    private static void businessUserCreation() {
        User vasya = new User(1, "Vasya");
        vasya.setConnection(Connection.getInstance());
    }
}
