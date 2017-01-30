package module5.practice.singleton;

/**
 * Created by citsym on 28.11.16.
 */
public enum Connection {
    CONNECTION;

    private String url = "https://someSite";

    public String getUrl() {
        return url;
    }

    public static Connection getInstance() {
        return CONNECTION;
    }
}
