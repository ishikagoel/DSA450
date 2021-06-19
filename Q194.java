package dsa450;

import dsa450.Q192.Node;

public class Q194 
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
	Node root;
	static Node prev=null;
	static Node head;
	static void TreeToList(Node root)
	{
		if(root==null)
		{
			return;
		}
		TreeToList(root.left);
		if(head==null)
		{
			head=root;
		}
		else
		{
			prev.right=root;
			root.left=prev;
		}
		prev=root;
		TreeToList(root.right);
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q194 tree=new Q194();
		tree.root=new Node(20);
		tree.root.left=new Node(8);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(12);
		tree.root.left.right.left=new Node(10);
		tree.root.left.right.right=new Node(14);
		tree.root.right=new Node(22);
		tree.root.right.right=new Node(25);
	 TreeToList(tree.root);
	 printLinkedlist(head);
	 System.out.println();

	}


	 static void printLinkedlist(Node node) {
		while(node!=null)
		{
			System.out.print(node.data+" ");
			node=node.right;
		}
		
	}

}
