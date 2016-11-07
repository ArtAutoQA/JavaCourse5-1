package practice;

/**
 * Created by citsym on 07.11.16.
 */
public class Task3 {

    public static void main(String[] args) {

        // Test data
        int balance = 1000000;
        int toWithdraw = 500;

        // logic to test
        balance = withdraw(balance, toWithdraw);

        // result
        System.out.println("Balance :" + balance);




        // Test data
        int balance2 = 1000000;
        int toWithdraw2 = 1000010;

        // logic to test
        balance2 = withdraw(balance2, toWithdraw2);

        // result
        System.out.println("Balance2 :" + balance2);
    }

    private static int withdraw(int balance, int toWithdraw) {
        if (canWithdraw(balance, toWithdraw)) {
            return balance - toWithdraw;
        }

        return balance;

    }

    private static boolean canWithdraw(int balance, int toWithdraw) {

        boolean canWithdraw = toWithdraw <= balance;

        if (canWithdraw) {
            System.out.println("OK");
        } else {
            System.out.println("Fail to withdraw");
        }

        return canWithdraw;
    }


}
