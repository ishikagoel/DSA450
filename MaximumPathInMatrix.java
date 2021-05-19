//import java.util.Scanner;

public class MaximumPathInMatrix {

    static int maximumPath(int n, int arr[][]) {
        int m = n;
        int max = Integer.MIN_VALUE;
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = arr[i][j];
                } else if (i == 0) {
                    dp[i][j] = arr[i][j];
                } else if (j == 0) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j + 1]) + arr[i][j];

                } else if (j == m - 1) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - 1]) + arr[i][j];
                } else {
                    dp[i][j] = Math.max(Math.max(dp[i - 1][j], dp[i - 1][j - 1]), dp[i - 1][j + 1]) + arr[i][j];

                }

            }
        }
        for (int j = 0; j < n; j++) {
            max = Math.max(max, dp[n - 1][j]);
        }
        return max;

    }

}