import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[]{10, 20, 15, 35, 5, 25, 45, 0, 40, -5};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] a) {
        int temp = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                temp = a[j];
                if (temp > a[j + 1]) {
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }

            }
        }
    }
}