import java.util.Scanner;
import java.util.*;
import java.io.*;
public class kthElementOfTwoSortedArrays
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int m = obj.nextInt();
        int k=obj.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = obj.nextInt();
        }
        for (int i = 0; i < m; i++) {
            arr2[i] = obj.nextInt();
        }
        long ans=kthElement(arr1,arr2,n,m,k);
        System.out.println(ans);
    }
    public static long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        
        if(arr1.length>arr2.length)
       {
           return kthElement(arr2, arr1,m,n,k);
       }
       int n1=arr1.length;
       int n2=arr2.length;
       int low=Math.max(0,k-n2);
       int high=Math.min(k,n1);
       
       while(low<=high)
       {
           int mid=(low+high)/2;
           int cut1=mid;
           int cut2=k-mid;

           int l1= cut1==0?Integer.MIN_VALUE:arr1[cut1-1];
           int l2= cut2==0?Integer.MIN_VALUE:arr2[cut2-1];

           int r1= cut1==n1?Integer.MAX_VALUE:arr1[cut1];
           int r2= cut2==n2?Integer.MAX_VALUE:arr2[cut2];

           if(l1<=r2&&l2<=r1)
           {
               return(Math.max(l1, l2));
           }
           else if(l1>r2)
           {
               high=cut1-1;
           }
           else{
               low=cut1+1;
           }
           
       }
       return -1;
   }
}