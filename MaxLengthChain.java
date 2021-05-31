import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MaxLengthChain {
    public static class pair {
        int x, y;

        public pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        pair[] arr = new pair[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new pair(obj.nextInt(), obj.nextInt());

        }
        System.out.println(MaxLengthChain(arr));
    }

    public static int MaxLengthChain(pair[] arr) {
        compare(arr);
        int[] dp = new int[arr.length];
        Arrays.fill(dp, 1);
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i].x > arr[j].y) {
                    int max = Math.max(dp[j] + 1, dp[i]);
                    dp[i] = max;
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < dp.length; i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    static void compare(pair[] arr) {
        Arrays.sort(arr, new Comparator<pair>() {
            public int compare(pair p1, pair p2) {
                return p1.x - p2.x;
            }

        });
    }

}
