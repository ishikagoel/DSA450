import java.util.*;
import java.io.*;
public class singleElementInSortedArray {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);

        int n=obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        int low=0;
        int high=n-2;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==arr[mid^1])
            {
                low=mid+1;
            }
            else 
            {
                high=mid-1;
            }
        }
        System.out.println(arr[low]);
    }
}
