package dsa450;

import java.util.Stack;

import dsa450.Q183.Node;

public class Q184 {
	static class Node{
		int data;
		Node left,right;
		Node(int item)
		{
			data=item;
			left=right=null;
		}
	}
	Node root;
	static void PostorderIterative(Node root)
	{
		if(root==null)
		{
			return;
		}
		Stack<Node> s=new Stack<>();
		s.push(root);
		Stack<Integer> out=new Stack<>();
		//s.push(root);
		Node curr=root;
		int f=0;
		while(!s.isEmpty())
		{
			curr=s.pop();
			out.push(curr.data);
			if(curr.left!=null)
			{
				s.push(curr.left);
			}
			 if(curr.right!=null)
			{
				s.push(curr.right);
			}
		}
			 while(!out.isEmpty())
			 {
				 System.out.println(out.pop());
			 }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q184 tree=new Q184();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.root.right.left=new Node(6);
		tree.root.right.right=new Node(7);
		PostorderIterative(tree.root);

	}

}
