/**
 * @author nica
 * @version 1.0
 */
public class LongDp {
  public static void main(String[] args) {
    LongDp longDp = new LongDp();
    String s = "cbbd";
    System.out.println(longDp.longestPalindrome(s));

  }
  public String longestPalindrome(String s) {
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        int maxLen=1;
        int maxLeft=0;
        int maxRight=0;
        if(s==null || len==1)
        {
          return s;
        }

        for(int right=1;right<len;right++)
        {
          for(int left=0;left<right;left++)
          {
            if(s.charAt(left)==s.charAt(right) &&((right-left<=2 || dp[left+1][right-1])))
            {
              dp[left][right]=true;
              if(right-left+1>maxLen)
              {
                maxLen=right-left+1;
                maxLeft=left;
                maxRight=right;
              }
            }

          }
        }
        String res = s.substring(maxLeft,maxRight+1);
        return res;
  }
}
