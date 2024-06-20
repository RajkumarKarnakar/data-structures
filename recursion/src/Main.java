public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 15, 78, -1000, 45, 9, 5, 88, 85, 125, 22, 200, 56, 99, 0};
        System.out.println("max is: " + maxOfArray(arr, arr.length));
        System.out.println("Min is: " + minOfArray(arr, arr.length));
    }

    static int maxOfArray(int[] a, int n) {
        if (n == 1) return a[0];
        return Math.max(a[n - 1], maxOfArray(a, n - 1));
    }

    static int minOfArray(int[] a, int n) {
        if (n == 1) return a[0];
        return Math.min(a[n - 1], minOfArray(a, n - 1));
    }
}