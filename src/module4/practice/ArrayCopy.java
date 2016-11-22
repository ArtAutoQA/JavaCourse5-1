package module4.practice;

import java.util.Arrays;

/**
 * Created by citsym on 21.11.16.
 */
public class ArrayCopy {

    public static void main(String[] args) {
        int[] array1 = new int[5];

        for (int i = 0; i < 5; i++) {
            array1[i] = i;
        }

        int[] array2 = new int[10];

        System.arraycopy(array1, 0, array2, 0,  5);

        System.out.println(Arrays.toString(array2));




    }
}
