package DynamicProgramming;

public class UniquePaths {

    public static void main(String[] args) {

        int m = 3;
        int n = 7;

        int[][] dp = new int[m][n];

        // First row
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }

        // First column
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }

        // Fill remaining cells
        for (int i = 1; i < m; i++) {

            for (int j = 1; j < n; j++) {

                dp[i][j] =
                        dp[i - 1][j]
                      + dp[i][j - 1];
            }
        }

        System.out.println("Unique Paths = " + dp[m - 1][n - 1]);
    }
}
