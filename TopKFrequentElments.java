import java.util.*;
import java.io.*;
public class TopKFrequentElments {
    public static class pair
    {
        int k,v;
        public pair(int k,int v)
        {
            this.k=k;
            this.v=v;
        }
    }
public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    int[] arr=new int[n];
    int k=obj.nextInt();
    for(int i=0;i<n;i++)
    arr[i]=obj.nextInt();
    int[] ans=topKFrequent(arr,k);
    for(int i=0;i<ans.length;i++)
    {
        System.out.print(ans[i]+" ");
    }
    System.out.println();
}
    public static int[] topKFrequent(int[] arr, int k) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] ans=new int[k];
      
        for(int i=0;i<arr.length;i++)
        {
              if(!map.containsKey(arr[i]))
              {
                  map.put(arr[i],1);
              }
            else
                map.put(arr[i],map.get(arr[i])+1);
        }
        ArrayList<ArrayList<pair>> ff=new ArrayList<>();
        for(int i=0;i<100001;i++)
        {
            ff.add(new ArrayList<>());
        }
        for(Integer i:map.keySet())
        {
            int key=i;
            int value=map.get(i);
            ff.get(value).add(new pair(key,value));
        }
        int id=0;
        for(int i=ff.size()-1;i>=0;i--)
        {
            for(int j=0;j<ff.get(i).size();j++)
            {
                if(k!=0)
                {
                pair p=ff.get(i).get(j);
                ans[id]=p.k;
                id++;
                }
                else
                {
                    break;
                }
                k--;
            }
        }
        return ans;
    }
}

