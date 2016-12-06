package module3.questions.zoo;

/**
 * Created by citsym on 11.11.16.
 */
public class Gorilla extends Monkey {
    private String color ;

    private int nutsCount = 10;

    public Gorilla(String color){
        System.out.println("Gorilla constructor");
        this.color = color;
    }


    public int breakNut() {
        nutsCount-- ;

        return nutsCount;
    }

    public int getNutsCount() {
        return nutsCount;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Gorilla gorilla = (Gorilla) o;

        if (nutsCount != gorilla.getNutsCount()) return false;


        return color!=null && color.equals(gorilla.getColor());

    }


    @Override
    public int hashCode() {
        int result = color.hashCode();
        result = 31 * result + nutsCount;
        return result;
    }
}
