import java.util.Scanner;

public class BurstBallons {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();

        }
        System.out.println(burstBallons(arr));
    }

    public static int burstBallons(int[] arr) {
        int[][] dp = new int[arr.length][arr.length];
        for (int g = 0; g < dp.length; g++) {
            for (int i = 0, j = g; j < dp.length; i++, j++) {
                int max = Integer.MIN_VALUE;
                for (int k = i; k <= j; k++) {
                    int left = k == i ? 0 : dp[i][k - 1];
                    int right = k == j ? 0 : dp[k + 1][j];
                    int val = arr[k];
                    if (i > 0)
                        val *= arr[i - 1];
                    if (j != arr.length - 1)
                        val *= arr[j + 1];
                    int total = left + right + val;
                    if (total > max)
                        max = total;

                }
                dp[i][j] = max;

            }
        }
        return dp[0][dp.length - 1];

    }
}
