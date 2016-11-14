package module3.practice;

/**
 * Created by citsym on 14.11.16.
 */
public class UseConverter {

    public static void main(String[] args) {

        double currencyRate = 29.2;

        ConverterOfCurrency converter = new ConverterOfCurrency(currencyRate);

        int uahAmount = 1000;

        double dollarsAmount =  converter.convert(uahAmount);

        System.out.println("You've got " + dollarsAmount + " changing "+ uahAmount + " UAH");
    }
}
