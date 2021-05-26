import java.util.Arrays;
import java.util.Scanner;

public class TargetSum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }
        int target = obj.nextInt();
        System.out.println(targetSum(arr, target));
    }

    public static int targetSum(int[] arr, int target) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if ((sum - target) % 2 == 1 || target > sum)
            return 0;
        int s2 = (sum - target) / 2;
        target = s2;
        int[][] dp = new int[arr.length + 1][target + 1];
        for (int i = 0; i <= arr.length; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= arr.length; i++) {
            for (int j = 0; j <= target; j++) {
                if (arr[i - 1] <= j)
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - arr[i - 1]];
                else
                    dp[i][j] = dp[i - 1][j];
            }
        }
        return dp[arr.length][target];

    }
}