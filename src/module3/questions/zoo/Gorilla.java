package module3.questions.zoo;

/**
 * Created by citsym on 11.11.16.
 */
public class Gorilla extends Monkey {
    String color ;

    static int nutsCount = 10;

    public Gorilla(String color){
        System.out.println("Gorilla constructor");
        this.color = color;
    }


    public  int breakNut() {
        nutsCount-- ;

        return nutsCount;
    }

    public int getNutsCount() {
        return nutsCount;
    }
}
