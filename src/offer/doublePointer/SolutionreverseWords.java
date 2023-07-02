package offer.doublePointer;

/**
 * @author nica
 * @version 1.0
 */
/*
* 输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。为简单起见，标点符号和普通字母一样处理。例如输入字符串"I am a student. "，则输出"student. a am I"。

 

示例 1：

输入: "the sky is blue"
输出: "blue is sky the"
示例 2：

输入: "  hello world!  "
输出: "world! hello"
解释: 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
示例 3：

输入: "a good   example"
输出: "example good a"
解释: 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
*/
public class SolutionreverseWords {
  public String reverseWords(String s) {
      s= s.trim();
      int len =s.length();
      int j=len-1;
      int i=j;
    StringBuilder sb = new StringBuilder();
    while(i>=0)
      {
        while(i>=0 && s.charAt(i)!=' ')i--;
        sb.append(s.substring(i+1,j+1));
        sb.append(" ");
        while(i>=0 && s.charAt(i)==' ')i--;
        j=i;
      }
      String res = sb.toString();
      res=res.trim();
      return res;
  }
}
