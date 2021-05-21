import java.util.Scanner;

public class GoldMine {
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
        for (int i = 0; i < n; i++) {
            dp[i][0] = arr[i][0];
        }

        int v1 = Integer.MIN_VALUE;
        int v2 = Integer.MIN_VALUE;
        int v3 = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i - 1 >= 0 && j - 1 >= 0) {
                    v1 = dp[j - 1][i - 1];
                }
                if (i - 1 >= 0) {
                    v2 = dp[j][i - 1];
                }
                if (j + 1 < n && i - 1 >= 0) {
                    v3 = dp[j + 1][i - 1];
                }
                if (Math.max(v1, Math.max(v3, v2)) != Integer.MIN_VALUE)
                    dp[j][i] = arr[j][i] + Math.max(v1, Math.max(v3, v2));

            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, dp[i][m - 1]);

        }
        System.out.println(max);
    }
}
