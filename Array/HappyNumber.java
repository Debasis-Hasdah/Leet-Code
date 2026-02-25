import java.util.HashSet;

public class HappyNumber {

    public static void main(String[] args) {
        int n = 19; // change to test

        boolean result = isHappy(n);

        System.out.println("Is Happy Number? " + result);
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNext(n);
        }

        return n == 1;
    }

    private static int getNext(int num) {
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }

        return sum;
    }
}