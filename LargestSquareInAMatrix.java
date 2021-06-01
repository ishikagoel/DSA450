import java.util.Scanner;

public class LargestSquareInAMatrix {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int m = obj.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = obj.nextInt();
            }
        }
        System.out.println(largestSquareInAMatrix(n, m, arr));
    }

    public static int largestSquareInAMatrix(int n, int m, int[][] arr) {
        int[][] dp = new int[n][m];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = arr[i][j];
                else

                    dp[i][j] = arr[i][j] == 0 ? 0
                            : Math.min(dp[i][j - 1], Math.min(dp[i - 1][j], dp[i - 1][j - 1])) + 1;
                max = Math.max(max, dp[i][j]);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        return max;
    }

}
