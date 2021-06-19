package dsa450;

import java.util.Scanner;
import java.util.Stack;

public class Q49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int t=obj.nextInt();
		while(t-->0)
		{
			int n=obj.nextInt();
			int m=obj.nextInt();
			int[][] arr=new int[n][m];
			int[][] s=new int[n][m];
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					arr[i][j]=obj.nextInt();
				}
			}
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					if(arr[i][j]==0)
					{
						s[i][j]=0;
					}
					else
					{
						if(i==0)
							s[i][j]=1;
						else
						s[i][j]=s[i-1][j]+1;
					}
				}
			}
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					System.out.print(s[i][j]+" ");
				}
				System.out.println();
			}
			Stack<Integer> stack=new Stack<>();
			int ans=0;
			for(int i=0;i<n;i++)
			{
				stack.clear();
				int[] left=new int[m];
				int[] right=new int[m];
				for(int j=0;j<m;j++)//left
				{
						while((!stack.isEmpty())&&(s[i][j]<=s[i][stack.lastElement()]))
							stack.pop();
						if(stack.isEmpty())
							left[j]=0;
						else
						{
							left[j]=stack.lastElement()+1;
						}
						stack.add(j);

				}
				stack.clear();
				for(int j=m-1;j>=0;j--)
				{
						while((!stack.isEmpty())&&(s[i][j]<=s[i][stack.lastElement()]))
							stack.pop();
						if(stack.isEmpty())
							right[j]=m-1;
						else
						{
							right[j]=stack.lastElement()-1;
							
						}
						stack.add(j);
				}
				for(int j=0;j<m;j++)
				{
					int v=(right[j]-left[j]+1)*s[i][j];
					ans=Math.max(v,ans);
				}
			}
			System.out.println(ans);
		}
	}
}
