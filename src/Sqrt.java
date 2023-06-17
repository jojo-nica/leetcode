/**
 * @author nica
 * @version 1.0
 */
public class Sqrt {
  public static void main(String[] args) {
    Sqrt sqrt = new Sqrt();
    int income = 13;
    int res = sqrt.numSquares(income);
    System.out.println(res);
  }

  public int numSquares(int n) {
    int size = (int)Math.sqrt(n) + 5;
    int[] coins = new int[size];
    int[] dp = new int[n + 5];
    for(int i = 0;i<coins.length;i++)
    {
      coins[i] = i*i;
    }

    for(int j = 1;j<dp.length;j++)
    {
      dp[j] = j;
    }

    for(int k = 2;k<coins.length;k++)
    {
      for(int money = coins[k];money< dp.length;money++)
      {
        dp[money] = Math.min(dp[money],dp[money-coins[k]]+1);
      }
    }

    return dp[n];
  }
}
