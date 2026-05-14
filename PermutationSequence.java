import java.util.*;

public class PermutationSequence {

    public static void main(String[] args) {

        int n = 4;
        int k = 9;

        List<Integer> numbers = new ArrayList<>();
        int factorial = 1;

        // Store numbers 1 to n
        for (int i = 1; i <= n; i++) {
            numbers.add(i);

            // Calculate factorial of (n-1)
            if (i < n) {
                factorial *= i;
            }
        }

        // Convert k to 0-based index
        k--;

        StringBuilder result = new StringBuilder();

        while (!numbers.isEmpty()) {

            // Find correct index
            int index = k / factorial;

            // Add selected number
            result.append(numbers.get(index));

            // Remove used number
            numbers.remove(index);

            // If no numbers left, stop
            if (numbers.isEmpty()) {
                break;
            }

            // Update k
            k = k % factorial;

            // Update factorial
            factorial = factorial / numbers.size();
        }

        System.out.println("K-th Permutation: " + result);
    }
}