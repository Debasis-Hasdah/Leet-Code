public class FirstOccurrenceIndex {

    // Method to find first occurrence of needle in haystack
    public static int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        // Edge case: empty needle
        if (m == 0) return 0;

        // Try matching needle starting at each valid index
        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == m) return i; // full match found
        }
        return -1; // no match
    }

    // psvm with examples
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));   // 0
        System.out.println(strStr("leetcode", "leeto")); // -1
    }
}
