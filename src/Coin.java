import java.util.Arrays;

/**
 * @author nica
 * @version 1.0
 */
public class Coin {
  public static void main(String[] args) {
    int[] income = {0};
    int amount = 0;
    Coin coin = new Coin();
    System.out.println(coin.coinChange(income,amount));

  }
  public int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount+1];
        Arrays.fill(dp,max);
        dp[0] = 0;
        for(int i = 1;i<=amount;i++)
        {
          for(int j=0;j<coins.length;j++)
          {
            if(coins[j] <= i)
            {
              dp[i] = Math.min(dp[i],dp[i-coins[j]]+1);
            }
          }
        }
        return dp[amount]>amount ? -1:dp[amount];
  }
}
