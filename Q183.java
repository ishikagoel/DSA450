package dsa450;

import java.util.Stack;

import dsa450.Q182.Node;

public class Q183 {

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
static void PreorderIterative(Node root)
{
	if(root==null)
	{
		return;
	}
	Stack<Node> s=new Stack<>();
	//s.push(root);
	Node curr=root;
	while(!s.isEmpty()||curr!=null)
	{
		if(curr!=null)
		{
			s.push(curr);
			System.out.println(curr.data);
			curr=curr.left;
		}
		else
		{
			curr=s.pop();
			curr=curr.right;
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q183 tree=new Q183();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.root.right.left=new Node(6);
		tree.root.right.right=new Node(7);
		PreorderIterative(tree.root);

	}

}
