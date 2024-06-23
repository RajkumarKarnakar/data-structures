import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Initialize an array of integers
        int[] numbers = generateRandomArray(10000, 1, 10000);

        System.out.println(Arrays.toString(numbers)); // Print the original array
        quickSort(numbers, 0, numbers.length - 1); // Sort the array using quicksort
        System.out.println(Arrays.toString(numbers)); // Print the sorted array
    }

    // Quicksort algorithm
    static void quickSort(int[] a, int start, int end) {
        if (start < end) {
            int pivot = partition(a, start, end); // Get the pivot index
            quickSort(a, start, pivot - 1); // Recursively sort the left subarray
            quickSort(a, pivot + 1, end); // Recursively sort the right subarray
        }
    }

    // Partitioning step in quicksort
    static int partition(int[] arr, int low, int high) {
        // Choosing the pivot (last element)
        int pivot = arr[high];

        // Index of smaller element and indicates
        // the right position of pivot found so far
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            // If current element is smaller than the pivot
            if (arr[j] < pivot) {
                // Increment index of smaller element
                i++;
                swap(arr, i, j); // Swap arr[i] and arr[j]
            }
        }
        swap(arr, i + 1, high); // Swap pivot with the correct position
        return (i + 1); // Return the pivot index
    }

    // Helper method to swap two elements in an array
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Generate an array of random integers within the specified range
    static int[] generateRandomArray(int size, int minValue, int maxValue) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            // Generate a random integer within the specified range
            array[i] = random.nextInt(maxValue - minValue + 1) + minValue;
        }

        return array;
    }
}
