import java.util.Scanner;

public class KnightProbabilityInChessBoard {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int k = obj.nextInt();
        int sr = obj.nextInt();
        int sc = obj.nextInt();
        double v = knightProbabilityInChessBoard(n, k, sr, sc);
        System.out.println(v);

    }

    public static double knightProbabilityInChessBoard(int n, int k, int sr, int sc) {
        double pr = 0;
        double[][] curr = new double[n][n];
        double[][] dp = new double[n][n];
        curr[sr][sc] = (double) 1;
        // int pr = 0;
        for (int kk = 1; kk <= k; kk++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (curr[i][j] != 0) {
                        if (valid(n, i - 2, j - 1))
                            dp[i - 2][j - 1] += curr[i][j] / 8.0;
                        if (valid(n, i - 1, j + 1))
                            dp[i - 2][j + 1] += curr[i][j] / 8.0;
                        if (valid(n, i + 2, j + 1))
                            dp[i + 2][j + 1] += curr[i][j] / 8.0;
                        if (valid(n, i + 2, j - 1))
                            dp[i + 2][j - 1] += curr[i][j] / 8.0;
                        if (valid(n, i - 1, j + 2))
                            dp[i - 1][j + 2] += curr[i][j] / 8.0;
                        if (valid(n, i - 1, j - 2))
                            dp[i - 1][j - 2] += curr[i][j] / 8.0;
                        if (valid(n, i + 1, j + 2))
                            dp[i + 1][j + 2] += curr[i][j] / 8.0;
                        if (valid(n, i + 1, j - 2)) {
                            dp[i + 1][j - 2] += curr[i][j] / 8.0;
                        }
                    }
                }

            }
            curr = dp;
            dp = new double[n][n];
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                pr += curr[i][j];
            }
        }
        return pr;
    }

    public static boolean valid(int n, int sr, int sc) {
        if (sr >= 0 && sc >= 0 && sr < n && sc < n) {
            return true;
        } else {
            return false;
        }
    }

}
