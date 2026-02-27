import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerFactorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int n = sc.nextInt();

        // compute factorial using BigInteger
        BigInteger fact = factorial(n);

        System.out.println(n + "! = " + fact);
        sc.close();
    }

    public static BigInteger factorial(int n) {
        // start from BigInteger.ONE
        BigInteger result = BigInteger.ONE;

        // multiply from 2 to n
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }
}