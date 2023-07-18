package offer.dynamic;

/**
 * @author nica
 * @version 1.0
 */
/*
* 输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。

要求时间复杂度为O(n)。


示例1:
输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
输出: 6
解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
*/
public class SolutionmaxSubArray {
  public static void main(String[] args) {
    int[] input = {-2,1,-3,4,-1,2,1,-5,4};
    System.out.println(maxSubArray(input));
  }
  public static int maxSubArray(int[] nums) {
      int[] dp = new int[nums.length];
      dp[0]=nums[0];
      int max = Integer.MIN_VALUE;
      max = dp[0];
      for(int i=1;i<dp.length;i++)
      {

          if(dp[i-1]>0) dp[i]=dp[i-1]+nums[i];
          else  dp[i]=nums[i];
          max=Math.max(dp[i],max);
      }
      return max;
  }
}
