public class FirstOccurrenceInString {

    // Method to find the first occurrence
    public static int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0) return 0;
        if (haystack == null) return -1;

        int n = haystack.length();
        int m = needle.length();

        // We only need to check positions up to n - m
        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == m) return i;
        }
        return -1;
    }

    // Main for testing
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));   // Output: 0
        System.out.println(strStr("leetcode", "leeto"));  // Output: -1
        System.out.println(strStr("hello", "ll"));        // Output: 2
        System.out.println(strStr("aaaaa", "bba"));       // Output: -1
    }
}