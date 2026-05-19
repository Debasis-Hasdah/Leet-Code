package Stringproblem;

public class BullsAndCows {

    public static void main(String[] args) {

        String secret = "1807";
        String guess = "7810";

        int bulls = 0;
        int cows = 0;

        int[] count = new int[10];

        for (int i = 0; i < secret.length(); i++) {

            int s = secret.charAt(i) - '0';
            int g = guess.charAt(i) - '0';

            // Bull
            if (s == g) {
                bulls++;
            }
            else {

                // If secret digit already needed by guess
                if (count[s] < 0)
                    cows++;

                // If guess digit already appeared in secret
                if (count[g] > 0)
                    cows++;

                count[s]++;
                count[g]--;
            }
        }

        String result = bulls + "A" + cows + "B";

        System.out.println("Output: " + result);
    }
}