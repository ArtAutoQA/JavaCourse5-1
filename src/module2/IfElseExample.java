package module2;

public class IfElseExample {
    public static void main(String[] args) {

        int a = 40;

        if (a == 10)
            System.out.println("cool");
        else
            System.out.println("not cool");


        //ternary if-else
        int b;

        b = a == 10 ? 100 : 200;


        if (a == 10)
            b = 100;
        else
            b = 200;

    }
}
