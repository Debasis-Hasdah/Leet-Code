import java.util.*;

public class GenerateParentheses {

    public static void main(String[] args) {
        int n = 3; 
        List<String> result = generateParenthesis(n);

        System.out.println("Valid combinations:");
        for (String s : result) {
            System.out.println(s);
        }
    }

    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backtrack(ans, "", 0, 0, n);
        return ans;
    }

    private static void backtrack(List<String> ans, String current,
                                  int open, int close, int n) {

       
        if (current.length() == 2 * n) {
            ans.add(current);
            return;
        }

       
        if (open < n) {
            backtrack(ans, current + "(", open + 1, close, n);
        }

        
        if (close < open) {
            backtrack(ans, current + ")", open, close + 1, n);
        }
    }
}