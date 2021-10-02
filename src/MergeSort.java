public class MergeSort {
    public static void mergeSort(int[] array) {
        int length = array.length;

        if (length < 2) {
            return;
        }

        int mid = length / 2;

        int[] leftHalf = new int[mid];
        int[] rightHalf = new int[length - mid];

        for (int i = 0; i < mid; i++) {
            leftHalf[i] = array[i];
        }
        for (int i = mid; i < length; i++) {
            rightHalf[i - mid] = array[i];
        }
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(array, leftHalf, rightHalf);

    }

    private static void merge(int[] array, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] >= rightHalf[j]) {
                array[k] = leftHalf[i];
                i++;
            } else {
                array[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while (i < leftSize) {
            array[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            array[k] = rightHalf[j];
            j++;
            k++;

        }
    }
}
