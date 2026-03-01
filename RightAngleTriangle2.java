import java.util.Scanner;

public class RightAngleTriangle2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        printTriangle(n);

        sc.close();
    }

    public static void printTriangle(int n) {
        if (n <= 0) {
            return;
        }

        // First row
        System.out.println("*");

        // Middle rows
        for (int i = 2; i < n; i++) {
            System.out.print("*");      // left star
            for (int j = 1; j < i; j++) {
                System.out.print(" "); // spaces
            }
            System.out.println("*");    // right star
        }

        // Last row (if n > 1)
        if (n > 1) {
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}