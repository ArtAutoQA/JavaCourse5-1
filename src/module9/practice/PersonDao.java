package module9.practice;


/**
 * Created by citsym on 13.01.17.
 */
public interface PersonDao {

    Person save(Person person);

    Person findByEmail(Person person);
}
