package offer.dynamic;

import java.util.HashMap;

/**
 * @author nica
 * @version 1.0
 */
/*
 * 请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子字符串的长度。

 

示例 1:

输入: "abcabcbb"
输出: 3
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
示例 2:

输入: "bbbbb"
输出: 1
解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
*/

public class SolutionlengthOfLongestSubstring {
  public static void main(String[] args) {
    String input = "bbbb";
    System.out.println(length(input));
  }
  public static int lengthOfLongestSubstring(String s) {
    if(s.equals("")) return 0;
    int[] dp = new int[s.length()];
    HashMap<Character, Integer> dic = new HashMap<>();
    char[] temp = s.toCharArray();
    int i=0,j=1;
    dp[0]=1;
    dic.put(temp[0],0);
    int max = dp[0];

    while(j<dp.length)
    {
      if(!dic.containsKey(temp[j]))
      {
        dic.put(temp[j],j);
        dp[j]= dp[j-1]+1;
      }
      else
      {
        if(i<dic.get(temp[j]))
        {
          i=dic.get(temp[j]);
        }
        dp[j]=j-i;
        dic.put(temp[j],j);
      }
      max = Math.max(dp[j],max);
      j++;
    }
    return max;
  }

  static  int length(String s)
  {
    if(s.equals("")) return 0;
    HashMap<Character, Integer> map = new HashMap<>();
    int left=0,right=0,res=0;
    while (right<s.length())
    {
      char ch = s.charAt(right);
      if(map.containsKey(ch))
      {
        left = Math.max(left,map.get(ch)+1);
      }
      map.put(ch,right);
      res = Math.max(res,right-left+1);
      right++;
    }
    return res;
  }

}
