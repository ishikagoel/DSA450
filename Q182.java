package dsa450;

import java.util.Stack;

public class Q182 {

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
	Node root;
	static void Iterative(Node root)
	{
		Stack<Node> s=new Stack<>();
		Node curr=root;
		while(!s.isEmpty()||curr!=null)
		{
			if(curr!=null)
			{
				s.push(curr);
				curr=curr.left;
			}
			else
			{
				curr=s.pop();
				System.out.println(curr.data);
				curr=curr.right;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q182 tree=new Q182();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.root.right.left=new Node(6);
		tree.root.right.right=new Node(7);
		Iterative(tree.root);
		

	}

}
