import java.util.*;
import java.io.*;
public class BottomView
{
    public class vpair
    {
        Node root;
        int hl;
        vpair(Node root,int hl)
        {
            this.root=root;
            this.hl=hl;
        }
    }
    public static void main(String[] args) {
        
    }
    public ArrayList<Integer> bottomView(Node root)
    {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        int min=0, max=0;
        ArrayList<Integer> ans=new ArrayList<>();
        LinkedList<vpair> q=new LinkedList<>();
        q.addLast(new vpair(root,0));
        while(!q.isEmpty())
        {
            int size=q.size();
            while(size-->0)
            {
                vpair rm=q.removeFirst();
                map.putIfAbsent(rm.hl,new ArrayList<>());
                map.get(rm.hl).add(rm.root.data);

                min=Math.min(min,rm.hl);
                max=Math.min(max,rm.hl);

                if(rm.root.left!=null)
                {
                    q.addLast(new vpair(rm.root.left, rm.hl-1));
                }
                if(rm.root.right!=null)
                {
                    q.addLast(new vpair(rm.root.right, rm.hl+1));
                }
            }
        }

        for(int i=min;i<=max;i++)
        {
            ans.add(map.get(i).get(map.get(i).size()-1));
        }
        return ans;

    }
}