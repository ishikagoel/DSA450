package dsa450;

import java.util.Scanner;

public class Q193 
{
	static class Node
	{
		int data;
		Node left,right;
		Node(int item)
		{
			data=item;
			left=right=null;
		}
	}
	static int start=0;

	public static Node string(String s)
	{
		if(start>=s.length())
		{
			return null;
		}
		boolean neg =false;
		if(s.charAt(start)=='-')
		{
			neg=true;
			start++;
		}
		int num=0;
		while(start<s.length()&&Character.isDigit(s.charAt(start)))
		{
			num=num*10+Character.getNumericValue(s.charAt(start));
			start++;
		}
		if(neg)
			num=-num;
		Node root=new Node(num);
		if(start<s.length()&&s.charAt(start)=='(')
		{
			start++;
			root.left=string(s);
		}
		if(start<s.length()&&s.charAt(start)==')')
		{
			start++;
			return root;
		}
		if(start<s.length()&&s.charAt(start)=='(')
		{
			start++;
			root.right=string(s);
		}
		if(start<s.length()&&s.charAt(start)==')')
		{
			start++;
			return root;
		}
		return root;
	}
	public static void preorder(Node root)
	{
		if(root==null)
		{
			return ;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}

	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		String s=obj.next();
		Node root=string(s);
		preorder(root);
		System.out.println();
	}
}
