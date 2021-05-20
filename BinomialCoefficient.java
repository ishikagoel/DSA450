//import java.util.Scanner;

public class BinomialCoefficient {
    static int nCr(int n, int r) {
        if (n > r && r > n - r) {
            r = n - r;
        }
        int[] dp = new int[r + 1];
        int mod = 1000000007;
        dp[0] = 1;
        for (int i = 1; i < n + 1; i++) {
            for (int j = r; j > 0; j--) {
                dp[j] = (dp[j] + dp[j - 1]) % mod;
            }
        }
        return dp[r];
    }
}