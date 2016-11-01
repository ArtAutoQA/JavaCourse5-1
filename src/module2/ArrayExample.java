package module2;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] array = {1, 20, 60, 9, -1};

        int[] array1 = new int[3];
        System.out.println(Arrays.toString(array1));
        //array name [ index of element ]
        array1[0] = 10;
        array1[1] = -10;
        array1[2] = 22;
        System.out.println(Arrays.toString(array1));


        char[] charArray = {'r', 't', 'y'};


        double[] doubleArrays = {'r', 't', 'y'};
        double[] doubleArrays1 = {1.4, 5,5, 8.9};

        System.out.println(Arrays.toString(doubleArrays));
    }
}
