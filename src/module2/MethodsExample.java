package module2;

public class MethodsExample {

    public static void main(String[] args) {

        test(500, 5);

        test(10, 100);

        test(10, -10);


        test1(100);
    }


    static int test(int a, int b) {
        int result;

        if (a < b)
            result = a;
        else
            result = b;

        System.out.println(result);

        return result;
    }


    static void test1(int a) {


    }


}
