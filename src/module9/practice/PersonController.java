package module9.practice;


import com.sun.tools.javac.util.StringUtils;

import java.util.Map;

import static module9.practice.UsePersonApp.*;

/**
 * Created by citsym on 13.01.17.
 */
public class PersonController {

    PersonDao personDao = new PersonDaoIml();

    public void save(Map<String, String> requestParams) throws Exception {

        String name = requestParams.get(FIRST_NAME);
        String secondNAme = requestParams.get(SECOND_NAME);
        String email = requestParams.get(EMAIL);

        if (name == null || name.isEmpty() || email == null || email.isEmpty()) {
            throw new Exception("Name and Email should be filled");
        }

        Person person = new Person(name, secondNAme, email);

        personDao.save(person);

    }

    public String findByEmail(Map<String, String> requestParams) throws Exception {

        String name = requestParams.get(FIRST_NAME);
        String secondNAme = requestParams.get(SECOND_NAME);
        String email = requestParams.get(EMAIL);

        if ( email == null || email.isEmpty()) {
            throw new Exception("Email should be filled");
        }

        Person person = new Person(name, secondNAme, email);

        String name1 = null;


        try {
            name1 = personDao.findByEmail(person).getName();
        } catch (PersonNotFoundException e) {
            System.out.println("Be carefull !!!!!! " + e.getMessage());
            e.printStackTrace();
        }

        return name1;

    }
}
