import java.util.*;
import java.io.*;
public class searchElementInRotatedArray 
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr=new int[n];
        int target=obj.nextInt();
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        System.out.println(search(arr, target));
    }
    public static int search(int[] arr, int target) {
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==target)
            return mid;
            if(arr[low]<arr[mid])
            {
                if(arr[low]<=target&&target<=arr[mid])
                {
                    high=mid-1;
                }
                else
                {
                    low=mid+1;
                }
            }
            else
            {
                if(arr[mid]<=target&&target<=arr[high])
                {
                    low=mid+1;
                }
                else
                high=mid-1;
            }
        }
        return -1;
    }
    
}
