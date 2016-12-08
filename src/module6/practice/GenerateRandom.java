package module6.practice;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by citsym on 05.12.16.
 */
public class GenerateRandom {
    public static void main(String[] args) {

        int[] array = new int[20];

        int b = 15;
        int a = 10;

        for (int i = 0; i < array.length; i++) {
            array[i] = getRandomInt(a, b);
        }

        System.out.println(Arrays.toString(array));

    }

    private static int getRandomInt2(int a, int b) {
        Random random = new Random();
        return a + random.nextInt(b- a+ 1);
    }

    private static int getRandomInt(int a, int b) {
        return (int) (a + Math.random() * (b - a+1));
    }
}
