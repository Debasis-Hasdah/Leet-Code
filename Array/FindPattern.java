public class FindPattern {

    public static void main(String[] args) {
        String s = "Hello";
        String p = "llo";

        int index = findPattern(s, p);

        System.out.println("Pattern starts at: " + index);
    }

    public static int findPattern(String s, String p) {
        // Use built-in method to find first occurrence
        int idx = s.indexOf(p);

        // indexOf() returns -1 if not found
        return idx;
    }
}