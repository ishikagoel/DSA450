import java.util.Scanner;

public class CombinationSumIV {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }
        int target = obj.nextInt();
        System.out.println(combinationSum4(arr, target));

    }

    public static int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] <= i)
                    dp[i] += dp[i - nums[j]];
            }
        }
        return dp[target];
    }

}
