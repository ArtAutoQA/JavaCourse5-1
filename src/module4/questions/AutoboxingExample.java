package module4.questions;

/**
 * Created by citsym on 18.11.16.
 */
public class AutoboxingExample {

    public static void main(String[] args) {

        int i = 240;  // 0000 0000 0000 0000 0000 0000 1111 0000

        Integer bigIntegerType =  i;

        int integerType = i;
        long longType = i;

        float floatType = i;            Float bigFloatType = floatType;
        double doubleType = i;

        char charType = 64;

        System.out.println(charType);

        boolean booleanType = false;


        bigFloatType =  (float) i;



    }

        public static void countSomThing(long integerType){
            integerType++;
        }
}
