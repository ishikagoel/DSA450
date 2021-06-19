package dsa450;

import java.util.HashMap;
import java.util.Scanner;

public class Q196 
{
	static class Node
	{
		int data;
		Node left,right;
		Node(int item)
		{
			data=item;
		}
	}
	static int id=0;
	static HashMap<Integer,Integer> map=new HashMap<>();
	static Node constructTree(int[] in,int[] pre,int instart,int inend)
	{
		if(instart>inend)
		{
			return null;
		}
		Node tnode=new Node(pre[id++]);
		if(instart==inend)
		{
			return tnode;
		}
		int index=findIndex(in,tnode.data);
		tnode.left=constructTree(in,pre,instart,index-1);
		tnode.right=constructTree(in,pre,index+1,inend);
		return tnode;
	}
	static int findIndex(int[] in,int data)
	{
		return map.get(data);
	}
	static void preorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		
		preorder(root.left);
		preorder(root.right);
		System.out.print(root.data+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int[] in=new int[n];
		int[] pre =new int[n];
		for(int i=0;i<n;i++)
		{
			in[i]=obj.nextInt();
			map.put(in[i],i);
		}
		for(int i=0;i<n;i++)
		{
			pre[i]=obj.nextInt();
		}
		Node root=constructTree(in,pre,0,n-1);
		preorder(root);
		System.out.println();


	}

}
