package module6.practice;

/**
 * Created by citsym on 05.12.16.
 */
public class Square extends View{

    int counter = 0;

    @Override
    void show() {
        counter++;
        System.out.println("show square" + counter + " time");

    }

    @Override
    void hide() {
        while (counter!=0){
            System.out.println("Hide  " + counter + "square");
            counter--;
        }
    }
}
