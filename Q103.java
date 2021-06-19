package dsa450;

import java.util.Scanner;

public class Q103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=obj.nextInt();
		}
		int ta=obj.nextInt();
		int id=binarySearch(arr,0,n-1);
		//System.out.println(id);
		int low=0,high=id-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==ta)
			{
				System.out.println(mid);
				break;
			}
			if(ta>arr[mid])
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}

		}
		 low=id;high=n-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==ta)
			{
				System.out.println(mid);
				break;
			}
			if(ta>arr[mid])
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}

		}
		//System.out.println();
		
		

	}
	public static int binarySearch(int[] arr,int low,int high)
	{
		if(low>=high)
		{
			return low;
		}
		int mid=(low+high)/2;
		if(arr[mid]>arr[high])
		{
			return binarySearch(arr,mid+1,high);
		}
		else
		{
			return binarySearch(arr,low,mid);
		}
	}

}
