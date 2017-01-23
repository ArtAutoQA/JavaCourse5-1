package module9.practice;





import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static module9.practice.UsePersonApp.EMAIL;
import static module9.practice.UsePersonApp.FIRST_NAME;
import static module9.practice.UsePersonApp.SECOND_NAME;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Created by citsym on 23.01.17.
 */
class PersonControllerTest {

    PersonController personController = new PersonController();

    @Test
    void saveTest() throws Exception {
        // prepare data

        Map<String, String> requestParams2 = new HashMap<>();
        requestParams2.put(FIRST_NAME, "Vasya");
        requestParams2.put(SECOND_NAME, "Pupkin");
        requestParams2.put(EMAIL, "pupki@some.net");

        Map<String, String> requestParams3 = new HashMap<>();
        requestParams3.put(FIRST_NAME, "Nastya");
        requestParams3.put(SECOND_NAME, "Petrova");
        requestParams3.put(EMAIL, "petrova@some.net");

        // execute code for testing
        personController.save(requestParams2);
        personController.save(requestParams3);

        // check the result

        String expected = "Nastya";
        String actual =  personController.findByEmail(requestParams3);

        assertEquals(expected, actual);

        String expected2 = "Vasya";
        String actual2 =  personController.findByEmail(requestParams2);
        assertEquals(expected2, actual2);
    }


    @Test
    void saveTestWithException() {
        // prepare data
        Map<String, String> requestParams = new HashMap<>();
        requestParams.put(FIRST_NAME, null);
        requestParams.put(SECOND_NAME, "Pupkin");
        requestParams.put(EMAIL, "pupki@some.net");

        // execute code


        // check the result
//
        assertThrows(InvalidFormException.class, ()-> personController.save(requestParams));

    }


    @Test
    void findByEmailTest() {
        System.out.println("Test2");
    }

}