package offer.Search;

import java.util.HashMap;

/**
 * @author nica
 * @version 1.0
 */
/*
* 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。

示例 1:

输入：s = "abaccdeff"
输出：'b'
*/
public class SolutionfirstUniqChar {
  public char firstUniqChar(String s) {
    if(s.length()==0) return  ' ';
    HashMap<Character, Integer> map = new HashMap<>();
    for(char c:s.toCharArray())
    {
      map.put(c,map.getOrDefault(c,map.getOrDefault(c,0)+1));
    }
    for(char c:s.toCharArray())
    {
      if(map.get(c) == 1)
      {
        return  c;
      }
    }
    return  ' ';
  }

  public char firstUniqChar1(String s)
  {
    char[] chars = s.toCharArray();
    HashMap<Character, Boolean> map = new HashMap<>();
    for(char c:chars)
    {
      map.put(c,!map.containsKey(c));
    }
    for(char c:chars)
    {
      if(map.get(c)) return  c;
    }
    return ' ';
  }

}
