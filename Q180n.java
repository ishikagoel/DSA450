package dsa450;

class Node
{
	Node left,right;
	int data;
}
public class Q180n 
{
	Node root;
	static class dpair
	{
		int h;
		int dia;
	}
	static dpair diameter(Node root)
	{
		if(root ==null )
		{
			dpair bp=new dpair();
			bp.h=-1;
			bp.dia=0;
		}
		dpair lp= diameter(root.left);
		dpair rp= diameter(root.right);
		dpair mp=new dpair();
		mp.h=Math.max(lp.h, rp.h)+1;
		int fes=lp.h+rp.h+2;
		mp.dia=Math.max(fes,Math.max(lp.dia,rp.dia));
		return mp;
	}
	public static void main(String[] args) 
	{

	}

}
