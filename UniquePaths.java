import java.util.Scanner;

public class UniquePaths {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int m = obj.nextInt();
        int n = obj.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < n; i++) {
            arr[0][i] = 1;
        }
        System.out.println(m);
        for (int i = 0; i < m; i++)
            arr[i][0] = 1;
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                arr[i][j] = arr[i - 1][j] + arr[j - 1][i];
            }
        }
        System.out.println(arr[m][n]);
    }
}