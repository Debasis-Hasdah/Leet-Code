public class FindFirstOccurrence {

    public static int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0) return 0;
        if (haystack == null) return -1;

        int n = haystack.length();
        int m = needle.length();

        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == m) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));   
        System.out.println(strStr("leetcode", "leeto")); 
        System.out.println(strStr("hello", "ll"));       
        System.out.println(strStr("aaaaa", "bba"));       
    }
}
