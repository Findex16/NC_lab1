package fillers;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArrayGenerator {

    private static int generateArr() {
        return (int) (Math.random() * 2147483647);
    }

    public static int[] massSorted (final int ARRAY_SIZE) {
        int[] array = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = generateArr();
        }
        Arrays.sort(array);
        return array;
    }

    public static int[] massSortedPlusX(final int ARRAY_SIZE, final int X) {
        int[] array;
        int[] generatedArray = massSorted(ARRAY_SIZE);
        array = Arrays.copyOf(generatedArray, ARRAY_SIZE + 1);
        array[ARRAY_SIZE - 1] = X;
        return array;
    }

    public static int[] massSortedReverseOrder(final int ARRAY_SIZE) {
        int[] array = massSorted(ARRAY_SIZE);
        for (int i = 0; i < ARRAY_SIZE / 2; i++) {
            int temp = array[i];
            array[i] = array[ARRAY_SIZE - i - 1];
            array[ARRAY_SIZE - i - 1] = temp;
        }
        return array;
    }

    public static int[] massRandom(final int ARRAY_SIZE) {
        int[] array = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = generateArr();
        }
        return array;
    }

}
