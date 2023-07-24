package offer.Math;

import java.util.ArrayList;

/**
 * @author nica
 * @version 1.0
 */
/*
* 0,1,···,n-1这n个数字排成一个圆圈，从数字0开始，每次从这个圆圈里删除第m个数字（删除后从下一个数字开始计数）。
* 求出这个圆圈里剩下的最后一个数字。

例如，0、1、2、3、4这5个数字组成一个圆圈，从数字0开始每次删除第3个数字，则删除的前4个数字依次是2、0、4、1，因此最后剩下的数字是3。
示例 1：
输入: n = 5, m = 3
输出: 3
示例 2：

输入: n = 10, m = 17
输出: 2*/
public class SolutionlastRemaining {
  public static void main(String[] args) {
    int n=10,m=17;
    System.out.println(lastremain(n,m));
  }
  public static int lastRemaining(int n, int m) {
    ArrayList<Integer> list = new ArrayList<>();
    for(int i=0;i<n;i++)
    {
      list.add(i);
    }
    int index=0;
    while(n>1)
    {
      index = (index+m-1)%n;
      list.remove(index);
      n--;
    }
    return list.get(0);
  }
  static  int lastremain(int n,int m)
  {
    int lastIndex = 0;
    for(int i=2;i<=n;i++)
    {
      lastIndex = (lastIndex+m)%i;
    }
    return lastIndex;
  }

}
