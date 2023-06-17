/**
 * @author nica
 * @version 1.0
 */
public class ThiefPlan {
  public static void main(String[] args) {
    ThiefPlan thiefPlan = new ThiefPlan();
    int[] income = {2,7,9,3,1};
    int res = thiefPlan.rob(income);
    System.out.println(res);
  }
  public int rob(int[] nums) {
    if(nums.length == 0)
    {
      return 0;
    }
        int n = nums.length;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = nums[0];
        for(int k = 2;k<=n;k++)
        {
          dp[k] = Math.max(dp[k-2]+nums[k-1],dp[k-1]);
        }
        return dp[n];

  }
}
