import java.util.Arrays;
import java.util.Scanner;

public class EditDistance {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.next();
        String s2 = obj.next();
        int[][] dp = new int[s.length()][s2.length()];
        // Arrays.fill(dp, -1);
        for (int i = 0, len = dp.length; i < len; i++)
            Arrays.fill(dp[i], -1);
        editDistance(0, 0, s, s2, dp);
        System.out.println(editDistance(0, 0, s, s2, dp));
    }

    public static int editDistance(int i, int j, String s1, String s2, int[][] dp) {
        if (i == s1.length()) {
            return s2.length() - j;
        }
        if (j == s2.length()) {
            return s1.length() - i;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        if (s1.charAt(i) == s2.charAt(j)) {
            return dp[i][j] = editDistance(i + 1, j + 1, s1, s2, dp);
        } else {
            int left = 1 + editDistance(i, j + 1, s1, s2, dp);
            int mid = 1 + editDistance(i + 1, j, s1, s2, dp);
            int right = 1 + editDistance(i + 1, j + 1, s1, s2, dp);
            return dp[i][j] = Math.min(Math.min(left, right), mid);
        }
    }
}
