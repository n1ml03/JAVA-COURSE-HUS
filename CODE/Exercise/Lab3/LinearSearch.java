import java.util.Arrays;

public class LinearSearch {
    public static boolean linearSearch(int[] array, int key) {
        for (int i : array) {
            if (i == key) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchIndex(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        int key = (int) (Math.random() * 100);
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Key: " + key);
        System.out.println("Linear search index: " + linearSearchIndex(array, key));
    }
}
