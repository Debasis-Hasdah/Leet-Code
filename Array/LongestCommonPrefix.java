public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        String prefix = strs[0];  // take first string as reference

        for (int i = 1; i < strs.length; i++) {
            // shrink prefix until it matches the start of current string
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.length() == 0)
                    return "";
            }
        }
        return prefix;
    }

    // psvm with examples
    public static void main(String[] args) {
        String[] strs1 = {"flower", "flow", "flight"};
        String[] strs2 = {"dog", "racecar", "car"};

        System.out.println("Output: " + longestCommonPrefix(strs1)); // fl
        System.out.println("Output: " + longestCommonPrefix(strs2)); // ""
    }
}
