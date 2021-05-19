import java.util.Scanner;

public class SubsetSum {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();

        }
        int ans = equalPartition(n, arr);
        System.out.println(ans);

    }

    static int equalPartition(int s, int arr[]) {
        // code here
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum % 2 != 0)
            return 0;
        else {
            int m = (sum / 2) + 1;
            boolean[][] t = new boolean[arr.length + 1][m];
            if (subsetSum(arr, sum / 2, t))
                return 1;
            else
                return 0;
        }
    }

    public static boolean subsetSum(int[] arr, int sum, boolean[][] t) {
        for (int i = 0; i < arr.length + 1; i++) {
            for (int j = 0; j < sum + 1; j++) {
                if (i == 0)
                    t[i][j] = false;
                if (j == 0)
                    t[i][j] = true;
            }

        }
        for (int i = 1; i < arr.length + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (arr[i - 1] <= j) {
                    t[i][j] = t[i - 1][j] || t[i - 1][j - arr[i - 1]];

                } else
                    t[i][j] = t[i - 1][j];

            }
        }
        return t[arr.length][sum];
    }
}