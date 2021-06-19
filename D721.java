package dsa450;

import java.util.Scanner;

public class D721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int t=obj.nextInt();
		while(t-->0)
		{
			int x=obj.nextInt();
			int y=obj.nextInt();
			int n=obj.nextInt();
			int m=obj.nextInt();
			int sum=1;
			int ans=1;
			for(int i=2;i<=n;i++)
			{
				sum=sum+i;
				ans+=sum;
			}
//			System.out.println(ans);
//			System.out.println(sum);
			int l=m+n-2;
			int num=sum;
			int ans2=0;
//			System.out.println(m);
//			System.out.println(l+"**");
			for(int j=n;j<=l;j++)
			{
				sum=sum+j;
				ans2+=sum;
				System.out.println(sum);
			}
			//System.out.println(ans+" "+ans2);
			System.out.println(ans+ans2);
			
		}

	}

}
