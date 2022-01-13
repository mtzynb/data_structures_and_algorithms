import java.util.Arrays;

/**
 * @author aglitchyy
 * @created 13/01/2022
 */

public class SelectionSort<T extends Comparable<T>> {

    public static void main(String[] args) {

        // sort integers!
        Integer[] unsortedIntArr = {20, 35, -15, 7, 55, 1, -22};
        SelectionSort<Integer> selectionSort = new SelectionSort<>();
        selectionSort.selectionSort(unsortedIntArr);
        Arrays.stream(unsortedIntArr).forEach(System.out::println);

        // sort strings!
        String[] unsortedStringArr = {"Rahaa", "Zey", "Zeynab", "Zeinab"};
        SelectionSort<String> stringSelectionSort = new SelectionSort<>();
        stringSelectionSort.selectionSort(unsortedStringArr);
        Arrays.stream(unsortedStringArr).forEach(System.out::println);

        // sort doubles!
        Double[] unsortedDoubleArr = {0.8, 2.5, 5.0, 100.0, 0.5, 0.1, -0.8};
        SelectionSort<Double> doubleSelectionSort = new SelectionSort<>();
        doubleSelectionSort.selectionSort(unsortedDoubleArr);
        Arrays.stream(unsortedDoubleArr).forEach(System.out::println);
    }

    private void selectionSort(T[] unsortedArr) {

        for (int lastUnsortedIndex = unsortedArr.length - 1; lastUnsortedIndex > 0;
             lastUnsortedIndex--) {

            int largest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (unsortedArr[i].compareTo(unsortedArr[largest]) > 0) {
                    largest = i;
                }
            }
            swap(unsortedArr, largest, lastUnsortedIndex);
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
