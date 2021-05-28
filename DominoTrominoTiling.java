import java.util.Scanner;

public class DominoTrominoTiling {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        System.out.println(tiling(n));

    }

    public static int tiling(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 5;
        for (int i = 4; i < n + 1; i++) {
            dp[i] = (2 * dp[i - 1] + dp[i - 3]);
        }
        return dp[n];

    }

}
