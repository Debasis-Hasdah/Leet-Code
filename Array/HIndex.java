
public class HIndex {

    public static void main(String[] args) {
        int[] citations1 = {3, 0, 6, 1, 5};
        int[] citations2 = {1, 3, 1};

        System.out.println("H-index = " + hIndex(citations1)); // 3
        System.out.println("H-index = " + hIndex(citations2)); // 1
    }

    public static int hIndex(int[] citations) {
int n = citations.length;

        // Step 1: Bucket array to count frequencies
        int[] count = new int[n + 1];

        for (int c : citations) {
            if (c >= n) count[n]++;      // cap large values
            else count[c]++;
        }

        // Step 2: Go backward to find largest h
        int papers = 0;
        for (int h = n; h >= 0; h--) {
            papers += count[h];
            if (papers >= h) return h;  // Found valid h-index
        }

        return 0;
    }
}
