import java.util.ArrayList;
import java.util.List;

public class triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int j = 0;
        int sum = 0;
        int v1 = 0, v2 = 0;
        v1 = Integer.MAX_VALUE;
        v2 = Integer.MAX_VALUE;
        List<List<Integer>> dp = new ArrayList<List<Integer>>();
         for(int i=0;i<triangle.size();i++)
         {
             dp.add(new ArrayList<>());
         }
         dp.get(0).add(triangle.get(0).get(0));
        for (int i = 1; i < triangle.size(); i++) 
        {
            if (j < dp.get(i-1).size()) {
                v1 = dp.get(i-1).get(j);
            }
            if (j + 1 < dp.get(i-1).size()) {
                v2 = dp.get(i-1).get(j + 1);
            }
            if (Math.min(v1, v2) != Integer.MAX_VALUE)
                dp.get(i).add( triangle.get(i).get(j) + Math.min(v1, v2));
            else
                dp.get(i).add( triangle.get(i).get(j));
            if (Math.min(v1, v2) == v2) {
                j = j + 1;
            }
        }
         for(int i=0;i<triangle.size();i++)
         {
             for(int k=0;k<dp.get(i).size();k++)
             {
                 System.out.print(dp.get(i).get(k)+" ");
             }
             System.out.println();
         }
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < dp.get(dp.size()-1).size(); i++) 
        {
            min=Math.min(min,dp.get(dp.size()-1).get(i));
        }
        return min;
    }

}
