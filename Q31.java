package dsa450;

import java.util.Scanner;

public class Q31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int t=obj.nextInt();
		while(t-->0)
		{
			int n=obj.nextInt();
			int[] arr=new int[n];
			int[] p=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=obj.nextInt();
				p[i]=0;
			}
			int max=arr[n-1];
			for(int i=n-2;i>=0;i--)
			{
				if(arr[i]>max)
				{
					max=arr[i];
				}
				p[i]=Math.max(p[i+1],max-arr[i]);
			}
			int min=arr[0];
			int ans=p[0];
			for(int i=0;i<n;i++)
				System.out.print(p[i]+" ");
			System.out.println();
			for(int i=1;i<n;i++)
			{
				if(min>arr[i])
				{
					min=arr[i];
				}
				ans=Math.max(ans,p[i]+arr[i]-min);
				
			}
			System.out.println(ans);
			
		}

	}

}
