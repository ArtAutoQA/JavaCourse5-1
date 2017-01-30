package module8.practice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by citsym on 23.12.16.
 */
public class UseGenerics {

    public static void main(String[] args) {
        List<? extends Number> list = new ArrayList<Double>();
        List<Integer> list1 = new ArrayList<Integer>();

//
//        Number number = list1.get(0);


        List<Number> numberList = new ArrayList<>();

        numberList.addAll(list);
        numberList.addAll(list1);


        List<? super Integer> listInt = new ArrayList<Number>();
        List<? super Double> listDouble = new ArrayList<Number>();



       List<Comparable<String>> arr = new ArrayList<>();


        Object o = new String("");



        A a = new A();
        B b = new A();

        b.someStaticMethood();
        B.someStaticMethood();
        System.out.println("=========");
        b.someMethood();

        System.out.println(sumOfNumbers(10, 11));


    }

    static <T extends Number, V extends T> Number sumOfNumbers(T number1, V number2){

        return number1.doubleValue() + number2.doubleValue();

    }
}
