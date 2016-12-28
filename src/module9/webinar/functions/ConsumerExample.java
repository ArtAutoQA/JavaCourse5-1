package module9.webinar.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        //Consumer<String> consumer1 = n -> printNames(n);
        //Consumer<String> consumer = ConsumerExample::printNames;

        //Consumer<String> consumer1 = n -> System.out.println(n);
        Consumer<String> consumer = System.out::println;


        Consumer<String> consumer1 = n -> System.out.println(n + "ooo");

        consumer.accept("Jeremy");
        consumer.accept("Paul");
        consumer.accept("Richard");

        int res = someExample();
        test(consumer1, res);


        //consumer usage example
        List<String> list = new ArrayList<>();
        list.add("Test1");
        list.add("Test2");
        list.add("Test3");

        list.stream().forEach(System.out::println);
    }

    private static <T> void test(Consumer<T> consumer, int a) {




    }


    static int someExample() {
        return 10;
    }

    private static void printNames(String name) {
        System.out.println(name);
    }
}
