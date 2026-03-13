import java.util.*;

public class BasicCalculatorExample {

    public static int calculate(String s) {

        int result = 0;
        int sign = 1;
        int num = 0;

        Stack<Integer> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            }

            else if (c == '+') {
                result += sign * num;
                num = 0;
                sign = 1;
            }

            else if (c == '-') {
                result += sign * num;
                num = 0;
                sign = -1;
            }

            else if (c == '(') {
                stack.push(result);
                stack.push(sign);

                result = 0;
                sign = 1;
            }

            else if (c == ')') {
                result += sign * num;
                num = 0;

                result *= stack.pop(); 
                result += stack.pop();
            }
        }

        result += sign * num;

        return result;
    }

    public static void main(String[] args) {

        String s1 = "1 + 1";
        String s2 = "2-1 + 2";
        String s3 = "(1+(4+5+2)-3)+(6+8)";

        System.out.println(s1 + " = " + calculate(s1));
        System.out.println(s2 + " = " + calculate(s2));
        System.out.println(s3 + " = " + calculate(s3));
    }
}