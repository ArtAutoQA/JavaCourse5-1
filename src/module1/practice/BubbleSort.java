package module1.practice;

import java.util.Arrays;

/**
 * Created by citsym on 07.11.16.
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {5, 6, 8, 2,  1, 9 };
        int[] sortedArray =  sort(array);

        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] sort(int[] toSort) {
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int j = 0; j < toSort.length - 1; j++) {
                if (toSort[j] > toSort[j + 1]) {
                    temp = toSort[j];
                    toSort[j] = toSort[j + 1];
                    toSort[j + 1] = temp;
                    flag = true;
                }
            }
        }
        return toSort;
    }
}
