package module7.questions;

import java.util.*;
import java.util.ArrayList;

/**
 * Created by citsym on 09.12.16.
 */
public class UseIterrator {

    public static void main(String[] args) {


        List<Character> al  = new ArrayList<>();

//        al.add(new Date());
        al.add('C');
        al.add('A');
        al.add('E');
        al.add('B');
        al.add('D');
        al.add('F');

        for (Object item : al) {

            getNumberValueFromItem(item);
        }

        Iterator iter = al.iterator();

        while (iter.hasNext()){
            Object element = iter.next();
            iter.remove();
            System.out.print(element + " ");
        }


        System.out.println(al);


        Object[] arrayObj = al.toArray();


        Character[] arrayChars = al.toArray(new Character[al.size()]);


//        module7.questions.ArrayList array = new module7.questions.ArrayList();
//
//
//        for (String item : array) {
//
//
//        }


    }

    private static void getNumberValueFromItem(Object item) {

        if (item instanceof Date){

            Date num  = (Date) item;

            System.out.println(num.getTime());
        }


        if (item instanceof Character){

            Character num  = (Character) item;

            System.out.println(Character.getNumericValue(num));
        }

    }
}
