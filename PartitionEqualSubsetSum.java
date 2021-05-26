import java.util.Scanner;

public class PartitionEqualSubsetSum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }
        boolean val = partitionEqualSubsetSum(arr);
        System.out.println(val);

    }

    public static boolean partitionEqualSubsetSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        if (sum % 2 != 0)
            return false;
        else {
            int m = (sum / 2);
            boolean[][] dp = new boolean[arr.length + 1][m + 1];
            System.out.println(sum / 2);
            for (int i = 0; i <= arr.length; i++) {
                for (int j = 0; j <= sum / 2; j++) {
                    if (j == 0)
                        dp[i][j] = true;
                    else if (i == 0)
                        dp[i][j] = false;
                    else {
                        if (arr[i - 1] <= j)
                            dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
                        else
                            dp[i][j] = dp[i - 1][j];
                    }
                }
            }
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j <= sum / 2; j++) {
                    System.out.print(dp[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println(dp[arr.length][m]);
            return dp[arr.length][m];
        }
    }

}
