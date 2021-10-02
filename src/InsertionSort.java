public class InsertionSort {
    public static void insertionSort(int[] array) {
        int length = array.length;
        for (int i = 1; i < length; i++) {
            int cur = array[i];
            int j = i - 1;
            while (j >= 0 && cur > array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = cur;
        }
    }
}
