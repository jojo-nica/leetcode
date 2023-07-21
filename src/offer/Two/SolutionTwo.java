package offer.Two;

/**
 * @author nica
 * @version 1.0
 */
/*
* 写一个函数，求两个整数之和，要求在函数体内不得使用 “+”、“-”、“*”、“/” 四则运算符号。
示例:
输入: a = 1, b = 1
输出: 2
*/
public class SolutionTwo {
  public int add(int a, int b) {
      int temp;
      int high;
      while(b!=0)
      {
        temp = a^b;
        high = (a&b)<<1;
        a=temp;
        b=high;
      }
      return a;
  }
}
