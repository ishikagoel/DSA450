package dsa450;

import java.util.Scanner;

public class Q107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=obj.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]==-1)
				System.out.print(i+1+" ");
			else
			{
				arr[arr[i]-1]=-1;
			}
		}
//		System.out.println();
//		for(int i=0;i<n;i++)
//		{
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
		for(int i=0;i<n;i++)
		{
			if(arr[i]>=0)
			{
				System.out.println(i+1);
				break;
			}
		}

	}

}
