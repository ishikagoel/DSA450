import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class MaximumOcurrences {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
       Scanner obj=new Scanner(System.in);

        String s1 = obj.nextLine();
        char[] s=s1.toCharArray();
        char ch=Character.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        //System.out.println(s1);
        // for(Character i:s)
        // {
        //     System.out.print(i);
        // }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length;i++)
        {
            if(map.containsKey(s[i]))
            {
                int value=map.get(s[i]);
                map.put(s[i],value+1);
                if(value+1>max)
                {
                    max=value+1;
                    ch=s[i];
                }
                else if(max==value+1)
                {
                    ch=(char) Math.min(ch,s[i]);
                }
            }
            else{
                    map.put(s[i],1);
                    max=Math.max(max,1);
                }
        }
        System.out.println(ch+" "+max);  
 

    }
}
