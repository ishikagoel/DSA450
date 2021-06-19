package dsa450;

import java.util.Scanner;

public class A721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int t=obj.nextInt();
		while(t-->0)
		{
			 int n =obj.nextInt();
            int ans= Integer.highestOneBit(n);
            ans--;
            System.out.println(ans);
        }
		}

	}

