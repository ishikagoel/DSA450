package dsa450;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node
{
	int data;
	Node left,right;
	Node(int item)
	{
		data=item;
		left=right=null;
	}
}
public class Q177178 {

	Node root;
//	static int height(Node root)
//	{
//		if(root==null)
//		{
//			return 0;
//		}
//		int lheight=height(root.left);
//		int rheight=height(root.right);
//		if(lheight>rheight)
//		{
//			return lheight+1;
//		}
//		else
//			return rheight+1;
//
//	}
//	static void printLevelOrder(Node root)
//	{
//		int h=height(root);
//		for(int i=1;i<=h;i++)
//		{
//			printGivenLevel(root,i);
//		}
//	}
//	static void printGivenLevel(Node root,int level)
//	{
//		if(root==null)
//			return;
//		if(level==1)
//			System.out.println(root.data);
//		else if(level>1)
//		{
//			printGivenLevel(root.left,level-1);
//			printGivenLevel(root.right,level-1);
//
//		}
//
//	}
	static void printLevelOrder(Node root)
	{
		Queue<Node> q=new LinkedList<>();
		Stack s=new Stack();
		q.add(root);
		while(!q.isEmpty())
		{
			Node tempNode=q.poll();
//			System.out.println(tempNode.data);
			s.add(tempNode.data);
			if(tempNode.left!=null)
			{
				q.add(tempNode.left);
			}
			if(tempNode.right!=null)
			{
				q.add(tempNode.right);
			}
		}
		while(!s.isEmpty())
		{
			System.out.println(s.pop());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q177178 tree=new Q177178();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.root.right.left=new Node(6);
		tree.root.right.right=new Node(7);
		printLevelOrder(tree.root);
	}

}
