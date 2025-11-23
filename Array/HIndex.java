import java.util.Arrays;

public class HIndex {

    public static void main(String[] args) {
        int[] citations1 = {3, 0, 6, 1, 5};
        int[] citations2 = {1, 3, 1};

        System.out.println("H-index = " + hIndex(citations1)); // 3
        System.out.println("H-index = " + hIndex(citations2)); // 1
    }

    public static int hIndex(int[] citations) {
        Arrays.sort(citations);  // sort ascending
        int n = citations.length;

        int h = 0;
        for (int i = 0; i < n; i++) {
            int papersWithAtLeastThisManyCitations = n - i;
            if (citations[i] >= papersWithAtLeastThisManyCitations) {
                h = papersWithAtLeastThisManyCitations;
                break;
            }
        }
        return h;
    }
}
