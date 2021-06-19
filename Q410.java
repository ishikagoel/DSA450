package dsa450;

import java.util.Scanner;

public class Q410 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int m=obj.nextInt();
		int[] arr=new int[m+1];
		 int[][] t=new int[m+1][n+1];
		for(int i=0;i<m;i++)
		{
			arr[i]=obj.nextInt();
		}
		System.out.println(knapsack(arr,m,n,t));


	}
	public static int knapsack(int arr[],int m,int n,int t[][])
	{
		for(int i=0;i<=m;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==0)
					t[i][j]=0;
				if(j==0)
					t[i][j]=1;
			}
		}
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(arr[i-1]<=j)
				{
					t[i][j]= t[i-1][j]+t[i][j-arr[i-1]];
				}
				else
					t[i][j]=t[i-1][j];
			}
		}
		return t[m][n];
	}

}
