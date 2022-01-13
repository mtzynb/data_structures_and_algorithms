import java.util.Arrays;

/**
 * @author aglitchyy
 * @created 13/01/2022
 */

public class BubbleSort<T extends Comparable<T>> {
    public static void main(String[] args) {

        // sort integers!
        Integer[] arr = {20, 35, -15, 7, 55, 1, -22};
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        bubbleSort.bubbleSort(arr);
        Arrays.stream(arr).forEach(System.out::println);

        // sort strings!
        String[] unsortedStringArr = {"Rahaa", "Zey", "Zeynab", "Zeinab"};
        BubbleSort<String> stringBubbleSort = new BubbleSort<>();
        stringBubbleSort.bubbleSort(unsortedStringArr);
        Arrays.stream(unsortedStringArr).forEach(System.out::println);

        // sort doubles!
        Double[] unsorterdDoubleArr = {0.8, 2.5, 5.0, 100.0, 0.5, 0.1, -0.8};
        BubbleSort<Double> doubleBubbleSort = new BubbleSort<>();
        doubleBubbleSort.bubbleSort(unsorterdDoubleArr);
        Arrays.stream(unsorterdDoubleArr).forEach(System.out::println);

    }


    public void bubbleSort(T[] arr) {

        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (arr[i].compareTo(arr[i + 1]) > 0) {
                    swap(arr, i, i + 1);
                }
            }
        }

    }

    private void swap(T[] arr, int i, int j) {
        if (i == j) {
            return;
        }
        T tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
