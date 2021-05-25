import java.util.ArrayList;
import java.util.List;

public class triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        // int j = 0;
        int sum = 0;
        int v1 = 0, v2 = 0;
        List<ArrayList<Integer>> dp = new ArrayList<ArrayList<Integer>>();
        dp.add(new ArrayList<>());
        dp.get(0).add(triangle.get(0).get(0));
        for (int i = 1; i < triangle.size(); i++) {
            dp.add(new ArrayList<>());
            for (int j = 0; j < triangle.get(i).size(); j++) {
                v1 = Integer.MAX_VALUE;
                v2 = Integer.MAX_VALUE;
                if (j < dp.get(i - 1).size())
                    v1 = dp.get(i - 1).get(j);
                if (j - 1 >= 0)
                    v2 = dp.get(i - 1).get(j - 1);
                if (Math.min(v1, v2) != Integer.MAX_VALUE)
                    dp.get(i).add(triangle.get(i).get(j) + Math.min(v1, v2));
                else
                    dp.get(i).add(triangle.get(i).get(j));
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < dp.get(dp.size() - 1).size(); i++) {
            min = Math.min(min, dp.get(dp.size() - 1).get(i));
        }
        return min;
    }
}