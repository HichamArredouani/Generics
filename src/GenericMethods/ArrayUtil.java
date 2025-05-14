package GenericMethods;

import java.util.Random;


public class ArrayUtil {
    public static <T> int countOccurencesInArray(T[] arr, T elToSearch) {
        int count = 0;
        for (T el : arr) {
            if (el.equals(elToSearch)) {
                count++;
            }
        }
        return count;
    }

    public static <T> T getRandomElInArray(T[] arr) {
        if (arr == null) {
            return null;
        }
        Random random = new Random();
        int randomIndex = random.nextInt(arr.length);
        return arr[randomIndex];

    }
}
