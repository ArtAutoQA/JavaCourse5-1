package module6.practice;

/**
 * Created by citsym on 05.12.16.
 */
public class Triangle extends View{

    boolean isShown = false;

    @Override
    void show() {
        if (isShown) {
            System.out.println("Cant show once more");
        } else {
            System.out.println("Show triangle");
            isShown = true;
        }
    }

    @Override
    void hide() {
        if (isShown) {
            System.out.println("Hide triangle");
            isShown = false;
        } else {
            System.out.println("Nothing to hide");
        }
    }
}
