import java.util.Arrays;
import java.util.Scanner;

public class LongestIncreasingSubsequenceCount {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }
        lis(arr);
    }

    public static void lis(int[] arr) {
        int[] dp = new int[arr.length];
        // arr[0] = 1;
        Arrays.fill(dp, 1);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }

}
