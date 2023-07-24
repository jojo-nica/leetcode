package offer.Math;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author nica
 * @version 1.0
 */
/*
* 输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。

序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。

示例 1：
输入：target = 9
输出：[[2,3,4],[4,5]]
示例 2：

输入：target = 15
输出：[[1,2,3,4,5],[4,5,6],[7,8]]。*/
public class CutRope {
  public static void main(String[] args) {
    int target = 15;
    System.out.println(Arrays.toString(findContinuousSequence(target)));
  }
  public static int[][] findContinuousSequence(int target) {
    ArrayList<int[]> list = new ArrayList<>();
    int left=1,right=2;
    while(left<target)
    {
      int sum = (right-left+1)*(left+right)/2;
      if(sum<target) right++;
      else  if(sum>target) left++;
      else
      {
        int[] res = new int[right-left+1];
        for(int i=left;i<=right;i++)
        {
          res[i-left]=i;
        }
        list.add(res);
        left++;
        //System.out.println(Arrays.toString(res));
      }
    }
    return list.toArray(new int[list.size()][]);
  }
}
