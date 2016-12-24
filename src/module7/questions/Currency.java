package module7.questions;

/**
 * Created by citsym on 09.12.16.
 */
public enum Currency {
    USD, UAH, EUR;


    public static Currency getInstance(String string){
        for (Currency currency : values()){
            if (currency.name().equalsIgnoreCase(string)){
                return currency;
            }
        }

       return USD;
    }
}
