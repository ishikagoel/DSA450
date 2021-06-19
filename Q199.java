package dsa450;

import java.util.HashSet;
import java.util.Set;

import dsa450.Q198.Node;

public class Q199 
{
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
	int f=1;
	static Set<Integer> set=new HashSet<>();
	static void check(Node root,int i)
	{
		
		if(root==null)
		{
			//i--;
			return;
		}
		//System.out.println(root.data+" "+ i);
		if(root.left==null&&root.right==null)
		{
			
			set.add(i+1);
			
		}
		check(root.left,i+1);
		check(root.right,i+1);
	}
	public static void main(String[] args) 
	{
		Q199 tree=new Q199();
		tree.root=new Node(20);
		tree.root.left=new Node(8);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(12);
		tree.root.left.right.left=new Node(10);
		tree.root.left.right.right=new Node(14);
		tree.root.right=new Node(22);
		tree.root.right.right=new Node(25);
		check(tree.root.left,0);
		check(tree.root.right,0);
		//System.out.println(set);
		if(set.size()<=1)
		{
			System.out.println(1);
		}
		else
			System.out.println(0);

	}
}
