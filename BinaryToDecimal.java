public class BinaryToDecimal {

    
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 1; // 2^0

        // Start from rightmost bit
        for (int i = binary.length() - 1; i >= 0; i--) {
            char bit = binary.charAt(i);

            if (bit == '1') {
                decimal += power;
            }
            power *= 2;
        }

        return decimal;
    }

  
    public static void main(String[] args) {

        String b1 = "1010";
        System.out.println(b1 + " in decimal is: " + binaryToDecimal(b1)); // 10

        String b2 = "101";
        System.out.println(b2 + " in decimal is: " + binaryToDecimal(b2)); // 5

        String b3 = "0";
        System.out.println(b3 + " in decimal is: " + binaryToDecimal(b3)); // 0

        String b4 = "10001";
        System.out.println(b4 + " in decimal is: " + binaryToDecimal(b4)); // 17
    }
}
