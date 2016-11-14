package module3.practice;

/**
 * Created by citsym on 14.11.16.
 */
public class Bank {

   private long balance;
   private String[] employees;
   private String adress;

    public Bank(long balance){
        this.balance = balance;
    }


    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setEmployees(String[] employees) {
        this.employees = employees;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Long getBalance() {
        return balance;
    }
}
