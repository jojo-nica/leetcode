import java.util.Arrays;
import java.util.Scanner;

/**
 * @author nica
 * @version 1.0
 */
public class findLen {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String nums = scanner.nextLine();
    String[] numString = nums.split(" ");
    int[] numbers = new int[numString.length];
    for(int i =0;i<numString.length;i++)
    {
      numbers[i] = Integer.parseInt(numString[i]);
    }

    findLen findLen = new findLen();
    System.out.println(findLen.lengthOfLIS(numbers));
  }
  public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        int dp[] = new int[len];
        int res = 1;
        Arrays.fill(dp,1);

        for(int i=1;i<len;i++)
        {
          for(int j=0;j<i;j++)
          {
            if(nums[i]>nums[j])
            {
              dp[i] = Math.max(dp[i],dp[j]+1);
            }
          }
        }
        for(int temp:dp)
        {
          res = Math.max(temp,res);
        }
        return res;
  }
}
