package module3.practice;

/**
 * Created by citsym on 14.11.16.
 */
public class UseBank {
    public static void main(String[] args) {
        Bank bank = new Bank(1000L);

        String[] employees = new String[10];
        employees[0] = "Jone Snow";

        bank.setEmployees(employees);

        bank.setAdress("Kyiv, SomeStreet 66");

        processBankForCompany(bank);



    }

    private static void processBankForCompany(Bank bank) {
        // logic how the bank processed by company
        long bankBalance = bank.getBalance();
        bank.setBalance(bankBalance+ 1000);
    }
}
