package webinar;

import java.util.ArrayList;
import java.util.List;

public class FirstExample {
    public static void main(String[] args) throws Exception {

        //syntax
        /*try {
            //code1
            //code2
            //code3
            //code4
        } catch (Throwable t) {
            //some logic

        }*/

        Integer a = null;

        //try-catch first example
        try {
            a.toString();

            System.out.println("finished");

            try {
                List<String> list = new ArrayList<>();
                list.get(0);
            } catch (Throwable t) {
                System.out.println("this el does not exist");
            }
        } catch (NullPointerException e) {
            System.out.println("null pointer has happened");
            System.out.println(a);

            //syntax
            //throw Throwable;

            Exception exception = new Exception("some exception", e);
            throw exception;

           /*try {
                Integer b = 10;
                b.toString();

                System.out.println(b);
            } catch (Throwable e1) {
                //
            }*/
        }

        System.out.println("done");


        try {
            List<String> list = new ArrayList<>();
            list.get(0);
        } catch (Throwable t) {
            System.out.println("this el does not exist");
        }

        //the best way to handle NPE
        a = null;
        if (a != null)
            a.toString();
        //else System.out.println("a is null");*/


    }
}
