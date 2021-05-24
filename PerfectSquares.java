import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PerfectSquares {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n + 1];

        Arrays.fill(arr, Integer.MAX_VALUE - 1);
        arr[0] = 0;
        ArrayList<Integer> ps = new ArrayList<>();
        ps.add(1);
        int num = 3;
        for (int i = 1; i <= 10001; i++) {
            int val = ps.get(ps.size() - 1) + num;
            num += 2;
            if (val <= n)
                ps.add(val);
        }
        for (int i = 0; i < ps.size(); i++) {
            for (int j = ps.get(i); j <= n; j++) {
                arr[j] = Math.min(arr[j - ps.get(i)] + 1, arr[j]);
            }
        }
        System.out.println(arr[n]);

    }
}