package module3.practice;

/**
 * Created by citsym on 14.11.16.
 */
public class ConverterOfCurrency {

    private double currencyRate;

    public ConverterOfCurrency(double currencyRate) {
        this.currencyRate = currencyRate;
    }

    public double convert(int uahAmount) {
        return uahAmount / currencyRate;
    }
}
