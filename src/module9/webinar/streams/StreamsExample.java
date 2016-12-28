package module9.webinar.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample<T> {
    public static void main(String[] args) {
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");
        stringCollection.add("aaa1");


        Predicate<String> stringPredicate = s -> s.length() == 4 && s.contains("a") || s.contains("b");


        //stream creation
        stringCollection.stream()
                //.map(String::toUpperCase)
                .sorted(String::compareTo)
                .filter(s -> s.length() == 4 && s.contains("a") || s.contains("b"))
                .collect(Collectors.toList());

                //.allMatch(p -> p.equals("aaa1"))
                //.noneMatch()
                //.anyMatch(p -> p.equals("aaa1"));
                //.map(String::toUpperCase)
                //.forEach(System.out::println);


        //paraller stream creation
        stringCollection.parallelStream();


        /*stringCollection.stream()
                //.map(n -> n.toUpperCase())
                //.sorted()
                .filter(s -> s.startsWith("p"));
                //.forEach(n -> System.out.println(n));*/


        //anyMatch((s) -> s.startsWith("a")
        //count

    }

}
