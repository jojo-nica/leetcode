package offer.Tree;

/**
 * @author nica
 * @version 1.0
 */
/*
* 实现 pow(x, n) ，即计算 x 的 n 次幂函数（即，xn）。不得使用库函数，同时不需要考虑大数问题。

 

示例 1：

输入：x = 2.00000, n = 10
输出：1024.00000
*/
public class SolutionMypaw {
  public static void main(String[] args) {
    SolutionMypaw mypaw = new SolutionMypaw();
    double input = 2.00000;
    System.out.println(mypaw.myPow(input,-2));
  }
  public double myPow(double x, int n) {
        if(n==0) return 1;
        if(n<0) return  1/x *myPow(1/x,-n-1);
        return (n%2==0)?myPow(x*x,n/2):x*myPow(x*x,n/2);
  }
}
