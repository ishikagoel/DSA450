import java.util.Scanner;

public class uniquePathsWithObstacles {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int m = obj.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = obj.nextInt();
                if (arr[i][j] == 1)
                    arr[i][j] = -1;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i][0] == -1)
                break;
            else
                arr[i][0] = 1;
        }
        for (int i = 0; i < m; i++) {
            if (arr[0][i] == -1)
                break;
            else
                arr[0][i] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (arr[i][j] != -1) {
                    if (arr[i - 1][j] <= 0 || arr[i][j - 1] <= 0)
                        arr[i][j] = Math.max(arr[i - 1][j], arr[i][j - 1]);
                    else {
                        if (i - 1 >= 0 && j - 1 >= 0)
                            arr[i][j] = arr[i - 1][j] + arr[i][j - 1];
                    }
                }
            }
        }
        if (arr[n - 1][m - 1] >= 0)
            System.out.println(arr[n - 1][m - 1]);
        else
            System.out.println(0);
    }
}
