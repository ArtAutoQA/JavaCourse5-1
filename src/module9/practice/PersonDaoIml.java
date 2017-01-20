package module9.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by citsym on 13.01.17.
 */
public class PersonDaoIml implements PersonDao {

    List<Person> list = new ArrayList<>();

    @Override
    public Person save(Person person) {

        boolean result = list.add(person);

        if (!result){
            throw new DBConnectionException(" Failed to save to DB");
        }

        return person;
    }

    @Override
    public Person findByEmail(Person person) {

        Optional<Person> first = list.stream().filter((t) -> t.getEmail().equals(person.getEmail())).findFirst();

        return first.orElseThrow(() -> new PersonNotFoundException("No user with such email: " + person.getEmail()));

    }
}
