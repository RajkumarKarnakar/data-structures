import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int[] arr = new int[]{-10, 40, 50, -80, 0, 100, 100, -100, -9};
        System.out.println(Arrays.toString(arr));
        insertionSortDesc(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSortDesc(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int current = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] < current) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = current;
        }
    }
}