package offer.Tree;

import java.util.Arrays;

/**
 * @author nica
 * @version 1.0
 */
/*
* 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。

示例 1:

输入: n = 1
输出: [1,2,3,4,5,6,7,8,9]
。*/
public class SolutionPrintNumbers {
  public static void main(String[] args) {
    SolutionPrintNumbers printNumbers = new SolutionPrintNumbers();
    System.out.println(Arrays.toString(printNumbers.printNumbers(3)));
  }
  public int[] printNumbers(int n) {
      int num = dfs(n)-1;
      int[] res = new int[num];
      for(int i=0;i<num;i++)
      {
        res[i]=i+1;
      }
      return res;

  }
  int dfs(int x)
  {
    if(x==1)return 10;
    return 10*dfs(x-1);
  }

}
