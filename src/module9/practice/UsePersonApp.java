package module9.practice;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by citsym on 13.01.17.
 */
public class UsePersonApp {

    public static final String FIRST_NAME = "firstName";
    public static final String SECOND_NAME = "secondName";
    public static final String EMAIL = "email";

    public static void main(String[] args) {

        // create data
        Map<String, String> requestParams = new HashMap<>();
        requestParams.put(FIRST_NAME, "Pavlo");
        requestParams.put(SECOND_NAME, "Kulishov");
        requestParams.put(EMAIL, "kuli@some.net");

        Map<String, String> requestParams2 = new HashMap<>();
        requestParams2.put(FIRST_NAME, "Vasya");
        requestParams2.put(SECOND_NAME, "Pupkin");
        requestParams2.put(EMAIL, "pupki@some.net");


        Map<String, String> requestParams3 = new HashMap<>();
        requestParams3.put(FIRST_NAME, "Nastya");
        requestParams3.put(SECOND_NAME, "Petrova");
        requestParams3.put(EMAIL, "petrova@some.net");


        // exetute code
        PersonController controller = new PersonController();
        try {
            controller.save(requestParams);
            controller.save(requestParams2);

        } catch (InvalidFormException e ) {
            sendMessageToUser(e.getMessage());
        } catch (DBConnectionException e) {
            String prepared = prepareMsgForDBProblems(e);
            sendMessageToUser(prepared);
        } catch (Exception e) {
            e.printStackTrace();
        }


        String name = null;

        try {
            name = controller.findByEmail(requestParams3);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // check the result

        System.out.println("Result is " + "Nastya".equals(name));


    }

    private static String prepareMsgForDBProblems(DBConnectionException e) {
        return null;
    }

    private static void sendMessageToUser(String message) {

    }
}
