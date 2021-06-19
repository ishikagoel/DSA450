package dsa450;

import java.util.Scanner;

public class B722
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int t=obj.nextInt();
		while(t-->0)
		{
			int n =obj.nextInt();
			String s=obj.next();
			char[] ch=s.toCharArray();
//			int a=0,b=0,c=0,d=0;
//			boolean len=false;
//			for(int i=0;i<s.length();i++)
//			{
//				if(a>0&&b>0&&ch[i]=='1')
//				{
//					len =true;
//					break;
//				}
//				else if(ch[i]=='1')
//				{
//					a++;
//				}
//				else if(a>0&&ch[i]=='0')
//				{
//					b++;
//				}
//
//			}
//			for(int i=0;i<s.length();i++)
//			{
//				if(c>0&&d>0&&ch[i]=='0')
//				{
//					len =true;
//					break;
//				}
//				else if(ch[i]=='0')
//				{
//					c++;
//				}
//				else if(c>0&&ch[i]=='1')
//				{
//					d++;
//				}
//
//			}
			int p=0,q=0;
			for(int i=0;i<s.length();i++)
			{
				if(ch[i]=='0')
					p++;
				else
					q++;
			}
//			if(len==false)
//			{
//				if(p%2!=0)
//				{
//					System.out.println("BOB");
//				}
//				else
//					System.out.println("ALICE");
//			}
//			else
//			{
				if(s.length()%2!=0)
				{
					if(ch[s.length()/2]=='0')
					{
						if(p==1)
							System.out.println("BOB");
						else
							System.out.println("ALICE");
						
					}
					else
						System.out.println("BOB");
				}
				else
				{
					System.out.println("BOB");
				}
			}
			//System.out.println(len);


		//}
	}
}
