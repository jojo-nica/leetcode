package offer.Stirng;

/**
 * @author nica
 * @version 1.0
 */
/*请实现一个函数，把字符串 s 中的每个空格替换成"%20"。

 

示例 1：

输入：s = "We are happy."
输出："We%20are%20happy."
* */
public class offer05 {
  public static void main(String[] args) {
    String s = "We are happy.";
    offer05 offer05 = new offer05();
    s.replace(" ","%20");
    System.out.println(s);
    //System.out.println(offer05.replaceSpace(s));
  }
  public String replaceSpace(String s) {
       StringBuilder builder = new StringBuilder();
       for(int i=0;i<s.length();i++)
       {
         char c = s.charAt(i);
         if(c == ' ')
         {
            builder.append("%20");
         }
         else
         {
           builder.append(c);
         }
       }
       return builder.toString();
  }


}

