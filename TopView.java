import java.util.*;
import java.io.*;
public class TopView {
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
    static ArrayList<Integer> topView(Node root)
    {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        ArrayList<Integer> ans=new ArrayList<>();
        LinkedList<vpair> q=new LinkedList<>();

        q.addLast(new vpair(root,0));
        int min=0,max=0;

        while(!q.isEmpty())
        {
            vpair rm=q.removeFirst();


        }

        
    }
}
