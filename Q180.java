package dsa450;

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
public class Q180 
{
	Node root;
	static void printLevelOrder(Node root)
	{
		int h1=0,h2=0;
		if(root.left!=null)
		{
			h1=height(root.left);
		}
		if(root.right!=null)
			h2=height(root.right);
		System.out.println(h1+h2+1);


	}
	static int diameter1(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		int ld=diameter1(root.left);
		int rd=diameter1(root.right);
		int f=height(root.left)+height(root.right)+2;
		int d=Math.max(f,Math.max(ld,rd));
		return d;
	}
	static int height(Node root) {
		if(root==null)
			return 0;
		int lh=height(root.left);
		int rh=height(root.right);
		if(lh>rh)
		{
			return lh+1;
		}
		else
			return rh+1;
	}
	public static void main(String[] args) {
		Q180 tree=new  Q180();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		// tree.root.right.right=new Node(7);
		tree.root.left.right=new Node(5);
		// tree.root.right.left=new Node(6);
		printLevelOrder(tree.root);
	}

}
