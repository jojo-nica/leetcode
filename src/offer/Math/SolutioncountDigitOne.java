package offer.Math;

/**
 * @author nica
 * @version 1.0
 */
/*
* 输入一个整数 n ，求1～n这n个整数的十进制表示中1出现的次数。

例如，输入12，1～12这些整数中包含1 的数字有1、10、11和12，1一共出现了5次。
示例 1：
输入：n = 12
输出：5
示例 2：

输入：n = 13
输出：6*/
public class SolutioncountDigitOne {
  public static void main(String[] args) {
    int n=13;
    System.out.println(countDigitOne(n));
  }
  public static int countDigitOne(int n) {
    return fn(n);
  }

 static int fn(int n)
  {
    if(n<=0) return 0;
    String s = String.valueOf(n);
    int high = s.charAt(0)-'0';
    int pow = (int)Math.pow(10,s.length()-1);
    int low = n-pow*high;
    if(high==1)
      return fn(pow-1)+fn(low)+low+1;
    else
      return high*fn(pow-1)+pow+fn(low);
  }

}
