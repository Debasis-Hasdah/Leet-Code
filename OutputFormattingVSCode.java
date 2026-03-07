public class OutputFormattingVSCode {

    public static void main(String[] args) {

        String s1 = "java";
        int x1 = 100;

        String s2 = "cpp";
        int x2 = 65;

        String s3 = "python";
        int x3 = 50;

        System.out.println("================================");

        System.out.printf("%-15s%03d%n", s1, x1);
        System.out.printf("%-15s%03d%n", s2, x2);
        System.out.printf("%-15s%03d%n", s3, x3);

        System.out.println("================================");
    }
}