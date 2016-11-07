package practice;

/**
 * Created by citsym on 07.11.16.
 */
public class Task2 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int n = 5;

        printCountResult(countNumberOfTimes(array, n));

    }

    private static void printCountResult(int k) {
        if (k == 0 ) {
            System.out.println("NO");
        } else if (k==1){
            System.out.println("YES");
        } else {
            System.out.println(k + "times");
        }
    }

    private static int countNumberOfTimes(int[] array, int n) {

        int k = 0;

        for (int i : array) {
            if (i == n ) {
                k++;
            }
        }

        return k;
    }


}
