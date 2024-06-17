public class Main {
    public static void main(String[] args) {
        System.out.println("Greatest common divisor: " + greatestCommonDivisor(1080, 308));
    }

    public static int greatestCommonDivisor(int m, int n) {
        if (n != 0) {
            return greatestCommonDivisor(n, m % n);
        } else {
            return m;
        }
    }
}