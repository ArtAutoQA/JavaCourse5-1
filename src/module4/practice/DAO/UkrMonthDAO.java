package module4.practice.DAO;

/**
 * Created by citsym on 21.11.16.
 */
public class UkrMonthDAO extends AbstractMonthDAO {


    String[] arrayUkr =  {"Січень", "Лютий", "Березень", "Квітень", "Травень"};

    @Override
    String[] getArray() {
        return arrayUkr;
    }

    @Override
    String[] setArray(String[] array) {
        return arrayUkr = array;
    }
}
