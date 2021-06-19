package dsa450;

import java.util.Scanner;

public class Q34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int t=obj.nextInt();
		while(t-->0)
		{
			int n=obj.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=obj.nextInt();
			}
			int[] prefix=new int[n];
			int[] sufix =new int[n];
			int max=arr[n-1];
			sufix[n-1]=arr[n-1];
			for(int i=n-2;i>=0;i--)
			{
				if(arr[i]>max)
					max=arr[i];
				sufix[i]=Math.max(sufix[i+1],max);
			}
			max=arr[0];
			prefix[0]=arr[0];
			for(int i=1;i<n;i++)
			{
				if(arr[i]>max)
					max=arr[i];
				prefix[i]=Math.max(prefix[i-1],max);
			}
			int ans=0;
			for(int i=1;i<n-1;i++)
			{
				int min=Math.min(prefix[i],sufix[i]);
				if(arr[i]<min)
					ans+=Math.abs(min-arr[i]);
			}
			System.out.println(ans);


		}
	}

}
