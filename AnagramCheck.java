public class AnagramCheck {

    public static boolean isAnagram(String s1, String s2) {
        // If lengths are different, not anagrams
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] freq = new int[256]; // ASCII characters

        // Count characters of first string
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
        }

        // Subtract characters of second string
        for (int i = 0; i < s2.length(); i++) {
            freq[s2.charAt(i)]--;
            if (freq[s2.charAt(i)] < 0) {
                return false;
            }
        }

        return true;
    }

    // psvm
    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";

        if (isAnagram(s1, s2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }

        String s3 = "hello";
        String s4 = "world";

        if (isAnagram(s3, s4)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
