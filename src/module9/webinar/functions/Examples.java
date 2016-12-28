package module9.webinar.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Examples {
    public static void main(String[] args) {
        //functions example
        Function<String, Integer> toInteger = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.valueOf(s);
            }
        };

        Function<String, Integer> toInteger0 = n -> Integer.valueOf(n);

        Function<String, Integer> toInteger1 = Integer::valueOf; //:: metdod reference -> lamda expression
        //Function<String, String> backToString = toInteger.andThen(String::valueOf);
        toInteger.apply("123");


        Function<Person, String> someFunc = Person::getJobDescription;
        Person person = new Person(1001, "Some descr");
        someFunc.apply(person);


        List<Person> persons = new ArrayList<>();
        persons.add(new Person(1, "Husband"));
        persons.add(new Person(2, "Dad"));
        persons.add(new Person(3, "Software engineer"));
        persons.add(new Person(4, "Adjunct instructor"));
        persons.add(new Person(5, "Pepperoni hanger"));


        //example with custom function
        /*Function<Person, Job> mapPersonToJob = new Function<Person, Job>() {
            public Job apply(Person person) {
                return new Job(person.getPersonId(), person.getJobDescription());
            }
        };*/

        test(toInteger, 10);

        Function<Person, Job> func = p -> new Job(p.getPersonId(), p.getJobDescription());

        //see at the end
        List<Job> jobs = persons.stream()
                .filter(isAdultMale())
                .map(func)
                .collect(Collectors.toList());

        System.out.println(jobs);
    }

    //predicate example
    public static Predicate<Person> isAdultMale() {
        //
        //
        //
        //
        //
        //
        return p -> p.getPersonId() < 21 && !p.getJobDescription().equalsIgnoreCase("Test");
    }


    static void test(Function<String, Integer> f, int age) {
        //logic

    }

}
