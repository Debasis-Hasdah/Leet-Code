public class DecimalToBinary {

    public static String toBinary(int n) {
        return Integer.toBinaryString(n);
    }

    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1 + " in binary is " + toBinary(num1));
        // Output: 1010

        int num2 = 5;
        System.out.println(num2 + " in binary is " + toBinary(num2));
        // Output: 101

        int num3 = 0;
        System.out.println(num3 + " in binary is " + toBinary(num3));
        // Output: 0
    }
}
