package dsa450;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Q192 
{
	static Set<Integer> set=new HashSet();
	static class Node
	{
		Node left,right;
		int data;
		Node(int item)
		{
			data=item;
		}

	}
	Node root;
	static void left(Node root)
	{
		if(root==null)
		{
			return;
		}
		if(root.left!=null)
		{
			System.out.print(root.data+" ");
			left(root.left);
		}
		else if(root.right!=null)
		{
			System.out.print(root.data+" ");
			left(root.right);
		}

	}
	static void leaf(Node root)
	{
		if(root==null)
		{
			return;
		}
		leaf(root.left);
		if(root.left==null&&root.right==null)
		{
			System.out.print(root.data+" ");
		}
		
		leaf(root.right);
	}
	static void right(Node root)
	{
		if(root==null)
		{
			return;
		}
		if(root.right!=null)
		{
			
			right(root.right);
			System.out.print(root.data+" ");
		}
		else if(root.left!=null)
		{
			right(root.left);
			System.out.print(root.data+" ");
			
		}
	}

	public static void main(String args[])
	{
		Q192 tree=new Q192();
		tree.root=new Node(20);
		tree.root.left=new Node(8);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(12);
		tree.root.left.right.left=new Node(10);
		tree.root.left.right.right=new Node(14);
		tree.root.right=new Node(22);
		tree.root.right.right=new Node(25);
		System.out.print(tree.root.data+" ");
		left(tree.root.left);
		leaf(tree.root.left);
		leaf(tree.root.right);
		right(tree.root.right);
//		Iterator it=set.iterator();
//		while(it.hasNext())
//		{
//			System.out.print(it.next()+" ");
//		}
		System.out.println();
	}

}
