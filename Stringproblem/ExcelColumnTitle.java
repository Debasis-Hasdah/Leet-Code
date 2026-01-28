package Stringproblem;

public class ExcelColumnTitle {

    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;                         // shift down by 1
            int rem = columnNumber % 26;
            sb.append((char)('A' + rem));
            columnNumber /= 26;
        }

        return sb.reverse().toString();           // reverse to get final
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(1));    // A
        System.out.println(convertToTitle(28));   // AB
        System.out.println(convertToTitle(701));  // ZY
        System.out.println(convertToTitle(702));  // ZZ
        System.out.println(convertToTitle(703));  // AAA
    }
}

