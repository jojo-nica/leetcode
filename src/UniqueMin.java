/**
 * @author nica
 * @version 1.0
 */
public class UniqueMin {
  public static void main(String[] args) {
    UniqueMin uniqueMin = new UniqueMin();
    int[][] grid = {{1,2,3},{4,5,6}};
    System.out.println(uniqueMin.minPathSum(grid));
  }
  public int minPathSum(int[][] grid) {
            int m = grid.length;
            int n= grid[0].length;
            int[][] dp = new int[m][n];

            for(int i=0;i<m;i++)
            {
              for(int j=0;j<n;j++)
              {
                if(i==0&&j==0)
                {
                  dp[i][j]=grid[i][j];
                  continue;
                }
                if(i==0)
                {
                  dp[i][j]=dp[i][j-1]+grid[i][j];
                }
                else if(j==0)
                {
                  dp[i][j]=dp[i-1][j]+grid[i][j];
                }
                else
                {
                  dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+grid[i][j];
                }

              }
            }
            return dp[m-1][n-1];
  }
}
