package dsa450;

import dsa450.Q194.Node;
public class Q198 
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
	static int  sum=0;
	static int f=1;
	static int s=0;
	static int sum(Node root)
	{
		if(root==null)
			return 0;
		sum(root.left);
		s+=root.data;
		sum(root.right);
		return s;
	}
	static void sumTree(Node root)
	{
		int ls = 0,rs=0;
		s=0;
		if(root==null)
			return ;
		if(root.left!=null)
		{
			ls=sum(root.left);
		}
		s=0;
		if(root.right!=null)
		{
			rs=sum(root.right);
		}
		if((ls+rs!=root.data)&&((root.left!=null)&&(root.right!=null)))
		{
			f=0;
		}
		if(root.left!=null)
			sumTree(root.left);
		if(root.right!=null)
			sumTree(root.right);
	}
	//****************************************
	//O(n) approach
	static int ss=0;
	static void isSumTree(Node root)
	{
		int ls=0,rs=0;
		if(root==null)
			return;
		isSumTree(root.left);
		isSumTree(root.right);
		if(root.left!=null&&root.right!=null)
		{
			if(isLeaf(root.left)==1)
			{
				ls=root.left.data;
			}
			else
			{
				ls=root.left.data*2;
			}
			if(isLeaf(root.right)==1)
			{
				rs=root.right.data;
			}
			else
			{
				rs=root.right.data*2;
			}
			if(ls+rs!=root.data)
			{
				f=0;
			}

		}

	}
	static int isLeaf(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		if(root.left==null&&root.right==null)
		{
			return 1;
		}
		return 0;
	}
	public static void main(String[] args) 
	{
		Q198 tree=new Q198();
		tree.root=new Node(26);
		tree.root.left=new Node(10);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(6);
		//		tree.root.left.right.left=new Node(10);
		//		tree.root.left.right.right=new Node(14);
		tree.root.right=new Node(3);
		tree.root.right.right=new Node(3);
		isSumTree(tree.root);
		if(f==1)
			System.out.println(1);
		else
			System.out.println(0);


	}

}
