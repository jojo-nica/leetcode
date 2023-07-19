package offer.dynamic;

/**
 * @author nica
 * @version 1.0
 */
/*
* 给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。一个数字可能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。

示例 1:
输入: 12258
输出: 5
解释: 12258有5种不同的翻译，分别是"bccfi", "bwfi", "bczi", "mcfi"和"mzi"
*/
public class SolutiontranslateNum {
  public static void main(String[] args) {
    int input = 18822;
    System.out.println(translateNum(input));
  }
  public static int translateNum(int num) {
        if(num<10) return 1;
        char[] nums=String.valueOf(num).toCharArray();
        int[] dp = new int[nums.length];
        dp[0]=1;
        dp[1]=nums[0]-'0'==1 || (nums[0]-'0'==2 && nums[1]-'0'<6)?2:1;
        for(int i=2;i<nums.length;i++)
        {
          dp[i]=nums[i-1]-'0'==1 || (nums[i-1]-'0'==2 && nums[i]-'0'<6)?dp[i-2]+dp[i-1]:dp[i-1];
        }
        return dp[nums.length-1];
  }
}
