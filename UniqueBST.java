import java.util.Scanner;

public class UniqueBST {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        System.out.println(UniqueBSTcount(n));

    }

    public static int UniqueBSTcount(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int max = i - j;
                int min = j - 1;
                dp[i] += dp[max] * dp[min];

            }
        }
        return dp[n];

    }

}
