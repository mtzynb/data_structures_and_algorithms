import java.util.Arrays;

/**
 * @author aglitchyy
 * @created 13/01/2022
 */

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        bubbleSort(arr);

        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void swap(int[] arr, int i, int j) {

        if (i == j) {
            return;
        }

        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;

    }

    public static void bubbleSort(int[] arr) {

        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }

    }
}
