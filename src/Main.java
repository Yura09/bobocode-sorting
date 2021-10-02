import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] array = new Random().ints(100000, 1, 100).sorted().toArray();
        int[] array1 = new Random().ints(100000, 1, 100).sorted().toArray();
        long startTime = System.nanoTime();
        MergeSort.mergeSort(array);
        long stopTime = System.nanoTime();
        System.out.println((stopTime - startTime) / 1000);
        startTime = System.nanoTime();
        InsertionSort.insertionSort(array1);
        stopTime = System.nanoTime();
        System.out.println((stopTime - startTime) / 1000);
    }

}
