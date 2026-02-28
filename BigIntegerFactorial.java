import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerFactorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int n = sc.nextInt();

       
        BigInteger fact = factorial(n);

        System.out.println(n + "! = " + fact);
        sc.close();
    }

    public static BigInteger factorial(int n) {
        
        BigInteger result = BigInteger.ONE;

        
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }
}