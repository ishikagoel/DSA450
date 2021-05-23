
import java.util.Arrays;

class CoinChange {
    public int coinChange(int[] coins, int amount) {
        long[] dp = new long[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= amount; j++) {
                dp[j] = Math.min(dp[j - coins[i]] + 1, dp[j]);
            }
        }
        int ans = (int) dp[amount];
        if (dp[amount] >= Integer.MAX_VALUE) {
            return -1;
        } else
            return ans;

    }
}
