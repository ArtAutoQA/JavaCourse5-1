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
    public Person save(Person person) throws Exception {

        boolean result = list.add(person);

        if (!result){
            throw new Exception(" Failed to save to DB");
        }

        return person;
    }

    @Override
    public Person findByEmail(Person person) {

        Optional<Person> first = list.stream().filter((t) -> t.getEmail().equals(person.getEmail())).findFirst();

        if (first.isPresent()){
            return first.get();
        } else {
            throw new PersonNotFoundException("No user with such email: " + person.getEmail());
        }

    }
}
