package dsa450;

import java.util.ArrayList;

import dsa450.Q184.Node;

public class Q185 {

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
	static int maxlevel=0;
	static ArrayList<Integer> arr=new ArrayList<>();
	static ArrayList<Integer> left(Node root)
	{
		leftView(root);
		return arr;
	}
//	static void leftView(Node root,int level)
//	{
//		
//		if(root==null)
//		{
//			return;
//		}
//		if(maxlevel<level)
//		{
//			arr.add(root.data);
//			maxlevel=level;
//		}
//		leftView(root.left,level+1);
//		leftView(root.right,level+1);
//		
//	}
	static void leftView(Node root)
    {
      if(root == null){
          return;
      }
      System.out.print(root.data+" ");
      if(root.left!=null){
          
          leftView(root.left);
      }
      else if(root.right!=null){
          leftView(root.right);
      }
      
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q185 tree=new Q185();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.root.right.left=new Node(6);
		tree.root.right.right=new Node(7);
	    ArrayList<Integer> arr=left(tree.root);
	    for(int i=0;i<arr.size();i++)
	    {
	    	System.out.println(arr.get(i));
	    }

	}

}
