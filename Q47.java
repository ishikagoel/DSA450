package dsa450;

import java.util.Scanner;

public class Q47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int t=obj.nextInt();
		while(t-->0)
		{
			int n=obj.nextInt();
			int m=obj.nextInt();
			int[][] arr=new int[n][m];
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					arr[i][j]=obj.nextInt();
				}
			}
			int index=m,row=-1;
			for(int i=0;i<n;i++)
			{
				if(index>0&&arr[i][index-1]==1)
				{
					for(int j=index-1;j>=0;j--)
					{
						if(arr[i][j]==1)
						{
							index=j;
							row=i;
						}
					}
				}
			}
			System.out.println(row);
				
				


		}

	}
}
