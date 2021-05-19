import java.util.Scanner;

public class MaximumPathInMatrix {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int m = obj.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = obj.nextInt();
            }
        }
        int[][] dp = new int[n][m];
        int max = Integer.MIN_VALUE;
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
                    if (i == n - 1) {
                        max = Math.max(max, dp[i][j]);
                    }
                }

            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(max);

    }
}