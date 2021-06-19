package dsa450;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int t=obj.nextInt();
		while(t-->0)
		{
			int n=obj.nextInt();
			int x=obj.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=obj.nextInt();
			}
			int[] f=new int[100001];
			for(int i=0;i<n;i++)
			{
				f[arr[i]]++;
			}
			for(int i=0;i<n;i++)
			{
				f[arr[i]]--;
				for(int j=i+1;j<n;j++)
				{
					f[arr[j]]--;
					if(f[x-arr[i]-arr[j]]>0)
					{
						System.out.println(1);
						System.exit(0);
					}
					f[arr[j]]++;
				}
				f[arr[i]]++;
			}

		}

	}
}
