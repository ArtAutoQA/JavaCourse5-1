package module5.practice.singleton;

/**
 * Created by citsym on 28.11.16.
 */
public class Connection2 {
    private String url = "https://someSite";
    private static Connection2 instance;

    private Connection2(){

    }

    public static Connection2 getInstance() {
        if (instance == null){
            instance = new Connection2();
        }
        return instance;
    }

}
