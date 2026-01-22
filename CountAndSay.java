public class CountAndSay {

    
    public static String countAndSay(int n) {
        String result = "1";

        for (int i = 2; i <= n; i++) {
            result = nextTerm(result);
        }

        return result;
    }

    
    private static String nextTerm(String s) {
        StringBuilder sb = new StringBuilder();

        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                sb.append(count).append(s.charAt(i - 1));
                count = 1;
            }
        }
        
        sb.append(count).append(s.charAt(s.length() - 1));

        return sb.toString();
    }

    
    public static void main(String[] args) {
        System.out.println("n = 1 -> " + countAndSay(1)); // "1"
        System.out.println("n = 2 -> " + countAndSay(2)); // "11"
        System.out.println("n = 3 -> " + countAndSay(3)); // "21"
        System.out.println("n = 4 -> " + countAndSay(4)); // "1211"
        System.out.println("n = 5 -> " + countAndSay(5)); // "111221"
        System.out.println("n = 6 -> " + countAndSay(6)); // "312211"
    }
}
