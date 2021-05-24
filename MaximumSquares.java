import java.util.Scanner;

public class MaximumSquares {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int m = obj.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                arr[i][j] = obj.nextInt();
        }
        int[][] dp = new int[n][m];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            dp[i][0] = arr[i][0];
            max = Math.max(dp[i][0], max);
        }
        for (int i = 0; i < m; i++) {
            dp[0][i] = arr[0][i];
            max = Math.max(dp[0][i], max);
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (arr[i][j] == 1)
                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i][j - 1], dp[i - 1][j])) + 1;
                else
                    dp[i][j] = 0;
                max = Math.max(dp[i][j], max);
            }
        }
        System.out.println(max);
    }

}
