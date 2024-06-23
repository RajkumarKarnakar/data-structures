public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.println(binarySearch(numbers, 10));
    }

    static int binarySearch(int[] a, int x) {
        int index = -1;
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] == x) {
                return mid;
            } else if (a[mid] > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }


        return index;
    }
}