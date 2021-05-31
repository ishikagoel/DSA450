import java.util.Scanner;

public class EggDroping {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int k = obj.nextInt();
        System.out.println(eggDroping(n, k));
    }

    public static int eggDroping(int n, int k) {
        int[][] dp = new int[n + 1][k + 1];
        for (int i = 0; i < n + 1; i++) {
            dp[i][1] = 1;
            dp[i][0] = 0;

        }
        for (int i = 0; i < k + 1; i++) {
            dp[1][i] = i;
            dp[0][i] = 0;

        }

        int min = Integer.MAX_VALUE;
        for (int i = 2; i < n + 1; i++) {
            for (int j = 2; j < k + 1; j++) {
                min = Integer.MAX_VALUE;
                for (int p = j - 1, m = 0; p >= 0; p--, m++) {
                    int max = Math.max(dp[i - 1][m], dp[i][p]);

                    min = Math.min(min, max);
                }
                // System.out.println();
                dp[i][j] = min + 1;
            }
        }
        return dp[n][k];
    }

}
