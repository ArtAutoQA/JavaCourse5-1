package module1.practice;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] balances = {1040, 5400, 4321, 900, -5000, 1001};
        String[] names = {"Test1", "Alexandr", "Denis", "module1.webinar.Test2", "User", "Pasha"};

        int count = 0;
        for (int bal : balances) {
            if (bal > 1000) {
                count = count + 1;
                //count
            }
        }

        String[] owners = new String[count];

        int index = 0;
        int indexOwners = 0;
        for (int bal : balances) {
            if (bal > 1000) {
                owners[indexOwners] = names[index];
                indexOwners++;
            }
            index++;
        }

        //the same as on lines 18-24
        /*int indexOwners1 = 0;
        for (int i = 0; i < balances.length; i++) {
            if (balances[i] > 1000) {
                owners[indexOwners1] = names[i];
            }
            index++;
        }*/


        System.out.println(Arrays.toString(owners));

    }


}
