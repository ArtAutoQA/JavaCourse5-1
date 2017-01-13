package module9.practice;


/**
 * Created by citsym on 13.01.17.
 */
public interface PersonDao {

    Person save(Person person) throws Exception;

    Person findByEmail(Person person);
}
