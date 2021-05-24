import java.util.Scanner;

public class KeysKeyBoard {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[1001];
        arr[0] = 0;
        arr[1] = 0;
        arr[2] = 2;
        arr[3] = 3;
        boolean check = false;
        for (int i = 4; i < arr.length; i++) {
            check = false;
            // System.out.println(i + " " + i);
            for (int j = i - 1; j > 1; j--) {
                // System.out.println(j + " " + j);
                if (i % j == 0) {
                    // System.out.println("**");
                    arr[i] = arr[j] + (i / j);
                    check = true;
                    break;
                }

            }
            if (check == false)
                arr[i] = i;

        }
        System.out.println(arr[n]);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " " + i);
        }

    }

}
