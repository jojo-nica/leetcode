package offer.StackandQueue;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @author nica
 * @version 1.0
 */
/*
* 给定一个数组 nums 和滑动窗口的大小 k，请找出所有滑动窗口里的最大值。

示例:

输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
输出: [3,3,5,5,6,7]
解释:

  滑动窗口的位置                最大值
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
*/
public class SolutionmaxSlidingWindow {
  public static void main(String[] args) {
    SolutionmaxSlidingWindow test = new SolutionmaxSlidingWindow();
    int[] input = new int[]{1,3,-1,-3,5,3,6,7};
    int k = 3;
    System.out.println(test.maxSlidingWindow(input,k));
  }
  public int[] maxSlidingWindow(int[] nums, int k) {
    int len = nums.length;
    int max_pos = len-k;
    LinkedList<Integer> max = new LinkedList<>();
    int[] res = new int[max_pos+1];
    int left;
    for(int right=0;right<len;right++)
    {
      while(!max.isEmpty() && nums[max.getLast()]<nums[right]) max.removeLast();
      max.addLast(right);
      left = right-k+1;
      if(left>max.peek())
      {
        max.removeFirst();
      }
      if(right>=k-1)
      {
        res[left]=nums[max.peek()];
      }
    }
    return res;
  }
}
