public class countNegativeNumbersInSortedMatrix {
    
}
public int countNegatives(int[][] grid) 
    {
        int ans=0;
        int low=0,high=grid[0].length-1;
        for(int i=0;i<grid.length;i++)
        {
            
            while(low<=high&&(low+high)/2)<grid[0].length&&(low+high)/2)>=0)
            {
                int mid=(low+high)/2;
                if(grid[i][mid]<0)
                {
                    high=mid-1;
                }
                else
                    low=mid+1;
            }
            ans+=grid[0].length-low;
            high=low;
            low=0;    
        }
        return ans;
        
    }