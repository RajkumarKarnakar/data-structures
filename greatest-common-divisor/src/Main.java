public class Main {
    public static void main(String[] args) {
        System.out.println("Greatest common divisor of 60 & 20 is: " + greatestCommonDivisor(375, 30));
    }

    public static int greatestCommonDivisor(int m, int n) {
        if (n != 0) {
            return greatestCommonDivisor(n, m % n);
        } else {
            return m;
        }
    }
}