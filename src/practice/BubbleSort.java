package practice;

import java.util.Arrays;

/**
 * Created by citsym on 07.11.16.
 */
public class BubbleSort {

    public static void main(String[] args) {
//        int[] array = {6, 5, 8, 9, 1 };
        int[] array = {5, 6, 8, 2,  1, 9 };
        int[] sortedArray =  sort(array);

        System.out.println(Arrays.toString(sortedArray));
    }

    private static int[] sort(int[] array) {
        boolean flag = true;

        while (flag) {
            for (int j = 0; j < array.length - 1; j++) {
                flag = false;
                int temp;
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;
                }
            }
        }
        return array;
    }
}
