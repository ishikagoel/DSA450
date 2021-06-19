package dsa450;

class Node
{
	Node left,right;
	int data;
	Node(int item){
		data=item;
		left=right=null;
	}
}
public class Q181 
{
	Node root;
	static Node NewNode(int val)
	{
		Node newNode=new Node(val);
		newNode.data=val;
		newNode.left=null;
		newNode.right=null;
		return newNode;
	}
	
	public static void inorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
		
	}
	static Node mirrorify(Node root)
	{
		if(root==null)
		{
			return null;
		}
		Node mirror=NewNode(root.data);
		mirror.right=mirrorify(root.left);
		mirror.left=mirrorify(root.right);
		return mirror;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q181 tree=new Q181();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.root.right.left=new Node(6);
		tree.root.right.right=new Node(7);
		inorder(tree.root);
		Node root=mirrorify(tree.root);
		inorder(root);
	}

}
