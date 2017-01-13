package module9.practice;

/**
 * Created by citsym on 13.01.17.
 */
public class UseExceptions {

    public static void main(String[] args) {

        int number1 = 10;
        Number number2 = 5;

        int division;
        try {
            division = getDivision(number1, (int) number2);
        } finally {

        }

        long veryLong = 3_000_000_000L;
        int notSoLong = 1;

        long x = veryLong / notSoLong;
        System.out.println(x);


        System.out.println("result " + getInt("One"));


        System.out.println("result " + division);

    }

    private static int getDivision(int number1, int number2) {
        return number1 / number2;
    }

    private static int getInt(String one) {
        try {
            int sum = 10/0;
            Integer result1 = Integer.valueOf(one);
            return 0;
        } catch (NumberFormatException | ArithmeticException e) {
//            e.printStackTrace();
            System.out.println( "Catched " + e.getMessage());
            return 0;
        } finally {
            System.out.println("что-то другое");
//            return -1;
        }
    }


}
