import java.util.Scanner;

public class string {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        int p = 0;
        while (t-- > 0) {
            int n = obj.nextInt();
            int k = obj.nextInt();
            String s = obj.next();
            char[] ch = s.toCharArray();
            int max = Integer.MIN_VALUE;
            int ans = 1;
            int l = s.length();
            if (l == 2)
                l = 0;
            else if (s.length() % 2 == 0) {
                l = (l / 2) - 1;
                // System.out.println(l);

            } else {
                l = l / 2;
            }
            max = (96 + k);
            // System.out.println(max);
            boolean pal = true;
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] != ch[s.length() - 1 - i]) {
                    pal = false;
                    break;

                }
            }

            for (int i = 0; i <= l; i++) {
                ch[i] = (char) Math.min(ch[i], ch[s.length() - 1 - i]);
            }

            // for (int i = 0; i < ch.length; i++) {
            // // max = Math.max(max, ch[i]);
            // System.out.print(ch[i] + " ");
            // }

            // System.out.println();
            // System.out.println(l);
            if (s.length() % 2 != 0) {
                for (int i = 0; i <= l; i++) {
                    if (i != l)
                        ans = ans * ((ch[i] - 'a') + 1);
                    else {
                        ans = ans * ((max - 'a') + 1);
                    }

                }
                ans = ans - (max - ch[l]);
            } else {
                for (int i = 0; i <= l; i++) {

                    ans = ans * ((ch[i] - 'a') + 1);
                }
                // System.out.println(ans + "***");

            }
            p++;
            if (n == 1) {
                int z = ch[0] - 'a';
                System.out.println("Case" + " #" + p + ": " + z);
            } else if (n == 2) {

                int z = ch[0] - 'a' + 1;
                if (pal == true)
                    z = z - 1;
                System.out.println("Case" + " #" + p + ": " + z);
            } else {
                if (pal == true)
                    ans = ans - 1;
                System.out.println("Case" + " #" + p + ": " + ans);

            }
        }

    }

}
