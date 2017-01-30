package module8.practice;

/**
 * Created by citsym on 23.12.16.
 */
public class A extends B {

    public static void someStaticMethood(){
        System.out.println("A");
    }

    @Override
    public void someMethood(){
        System.out.println("A");
    }

}
