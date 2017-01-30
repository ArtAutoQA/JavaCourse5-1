package module5.practice.singleton;

/**
 * Created by citsym on 28.11.16.
 */
public class User {
    private final int id;
    private final String name ;
    private Connection connection ;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public void setConnection(Connection connection) {
        System.out.println(connection);
        this.connection = connection;
    }

}
