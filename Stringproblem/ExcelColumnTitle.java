package Stringproblem;

public class ExcelColumnTitle {

    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;                         
            int rem = columnNumber % 26;
            sb.append((char)('A' + rem));
            columnNumber /= 26;
        }

        return sb.reverse().toString();           
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(1));   
        System.out.println(convertToTitle(28));   
        System.out.println(convertToTitle(701));  
        System.out.println(convertToTitle(702));  
        System.out.println(convertToTitle(703));  
    }
}

