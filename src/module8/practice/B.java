package module8.practice;

import java.io.Serializable;

/**
 * Created by citsym on 23.12.16.
 */
public class B implements Serializable{


    public static void someStaticMethood(){
        System.out.println("B");
    }


    public void someMethood(){
        System.out.println("B");
    }
}
