public class PowXN {

    public static double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return fastPow(x, N);
    }

    private static double fastPow(double x, long n) {
        if (n == 0) return 1.0;

        double half = fastPow(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }

    public static void main(String[] args) {
        System.out.println(myPow(2.00000, 10));     // 1024.0
        System.out.println(myPow(2.10000, 3));      // approx 9.261
        System.out.println(myPow(2.00000, -2));     // 0.25000
        System.out.println(myPow(5.0, 0));          // 1.0
        System.out.println(myPow(1.00000, 1000));   // 1.0
    }
}
