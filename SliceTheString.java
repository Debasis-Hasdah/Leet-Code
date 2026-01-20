public class SliceTheString {

    // Method to slice the string (remove first and last chars)
    public static String sliceString(String s) {
        if (s == null || s.length() <= 2) {
            return "";  // if string is too short, return empty
        }
        return s.substring(1, s.length() - 1);
    }

    public static void main(String[] args) {
        String str1 = "GeeksforGeeks";
        System.out.println("Original: " + str1);
        System.out.println("Sliced: " + sliceString(str1));  // eeksforGeek

        String str2 = "Hello";
        System.out.println("Original: " + str2);
        System.out.println("Sliced: " + sliceString(str2));  // ell

        String str3 = "AB";
        System.out.println("Original: " + str3);
        System.out.println("Sliced: " + sliceString(str3));  // (empty string)
    }
}
