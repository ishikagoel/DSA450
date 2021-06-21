
import java.io.*;
import java.util.*;
public class nthrootofanumber
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);

        int n=obj.nextInt();
        int m=obj.nextInt();

        double low=1;
        double high=m;
        double e=1e-6;

        while(high-low>e)
        {
            double mid=(low+high)/2;
            double num=Math.pow(mid,n);
            if(num>m)
            {
                high=mid;
            }
            else
            low=mid;
        }
        System.out.println(low);
    }
}
