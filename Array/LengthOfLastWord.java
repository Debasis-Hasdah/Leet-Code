public class LengthOfLastWord {

    // Method to find length of last word
    public static int lengthOfLastWord(String s) {
        int len = 0;
        int i = s.length() - 1;

        // Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') i--;

        // Count characters of the last word
        while (i >= 0 && s.charAt(i) != ' ') {
            len++;
            i--;
        }
        return len;
    }

    // Main method with examples
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));                  // 5
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));   // 4
        System.out.println(lengthOfLastWord("luffy is still joyboy"));         // 6
    }
}
