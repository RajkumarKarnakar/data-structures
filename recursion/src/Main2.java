public class Main2 {
    public static void main(String[] args) {
        System.out.println("Factorial: " + factorial(5, 1));
    }

    static long factorial(long n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }

    static long factorial(long n, long result) {
        //tail recursion
        if (n == 0) {
            return result;
        }
        return factorial(n - 1, result * n);
    }
}
