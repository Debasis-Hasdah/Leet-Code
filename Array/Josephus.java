public class Josephus {

    public static void main(String[] args) {
        int n = 7; // total people
        int k = 3; // skip

        int winner = josephus(n, k);

        System.out.println("The safe position is: " + winner);
    }

    public static int josephus(int n, int k) {
        return josephusRec(n, k) + 1; // convert to 1-indexed
    }

    private static int josephusRec(int n, int k) {
        if (n == 1) {
            return 0; // base case
        }
        return (josephusRec(n - 1, k) + k) % n;
    }
}