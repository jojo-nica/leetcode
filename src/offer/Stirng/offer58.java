package offer.Stirng;

/**
 * @author nica
 * @version 1.0
 */
/*
* 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。

 

示例 1：

输入: s = "abcdefg", k = 2
输出: "cdefgab"
示例 2：

输入: s = "lrloseumgh", k = 6
输出: "umghlrlose"

*/
public class offer58 {
  public static void main(String[] args) {
    int k = 6;
    String s = "lrloseumgh";
    offer58 offer58 = new offer58();
    System.out.println(offer58.reverseLeftWords2(s,6));
  }
  //申请额外空间
  public String reverseLeftWords(String s, int n) {
    StringBuilder builder = new StringBuilder();
    for(int i=n;i<s.length();i++)
    {
      builder.append(s.charAt(i));
    }
    for(int i=0;i<n;i++)
    {
      builder.append(s.charAt(i));
    }
    return  builder.toString();
  }
  //不申请额外空间
  public String reverseLeftWords2(String s, int n)
  {
    StringBuilder builder = new StringBuilder(s);
    exchangeBuilder(builder,0,n-1);
    exchangeBuilder(builder,n,s.length()-1);
    exchangeBuilder(builder,0,s.length()-1);
    return  builder.toString();
  }

  public void exchangeBuilder(StringBuilder sb,int start,int end)
  {
      while(start < end)
      {
        char temp = sb.charAt(start);
        sb.setCharAt(start, sb.charAt(end));
        sb.setCharAt(end,temp);
        start++;
        end--;
      }
  }

}
