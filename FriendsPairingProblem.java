import java.util.Scanner;

public class FriendsPairingProblem {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n + 1];
        // for (int i = 0; i < n; i++) {
        // arr[i] = obj.nextInt();

        // }
        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i <= 2) {
                dp[i] = i;
            } else {
                dp[i] = dp[i - 1] + (i - 1) * dp[i - 2];
            }
        }
        System.out.println(dp[n - 1]);
        System.out.println(dp[n]);

    }
}