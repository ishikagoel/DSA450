import java.util.*;

import java.io.*;
public class kthElementInAsortedMatrix {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] s=br.readLine().trim().split(" ");
        int n=Integer.parseInt(s[0]);
        int m=Integer.parseInt(s[1]);
        int k=Integer.parseInt(s[2]);
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++)
        {
            String[] s1=br.readLine().trim().split(" ");
            for(int j=0;j<m;j++)
            {
                arr[i][j]=Integer.parseInt(s1[j]);
            }
        }
        int ans=kthSmallest(arr,k);
        System.out.println(ans);

    }

    public static  int kthSmallest(int[][] arr, int k) 
    {
        int n=arr.length;
        int m=arr[0].length;
        int low=arr[0][0];
        int high=arr[n-1][m-1];
        System.out.println(high);
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int count=findNoOfElementLessThanMid(arr,mid);
            //System.out.println(low+" "+high+" "+mid+" "+count);
            if(count<k)
                low=mid+1;
            else
            high=mid-1;
        }
        return low;

    }
    public static int findNoOfElementLessThanMid(int[][] arr,int target)
    {
        int low=0,high=arr[0].length-1;
        int count=0;
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            count=0;
            while(low<=high)
            {
                int mid=low+(high-low)/2;
                if(mid>=0&&mid<arr[0].length&&arr[i][mid]<=target)
                {
                    low=mid+1;
                }
                else
                {
                    high=mid-1;
                }
            }
            ans+=low;
            high=low;
            low=0;
        }
        return ans;
    }
}
