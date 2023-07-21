package offer.Math;

import java.util.Arrays;

/**
 * @author nica
 * @version 1.0
 */
/*
* 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。

 

你可以假设数组是非空的，并且给定的数组总是存在多数元素。

 

示例 1:

输入: [1, 2, 3, 2, 2, 2, 5, 4, 2]
输出: 2
*/
public class SolutionmajorityElement {
  public static void main(String[] args) {
    int[] input = {3,3,4};
    System.out.println(majorityElement(input));
  }
  public static int majorityElement(int[] nums) {
    int more=0;
    int votes=0;
    for(int i=0;i<nums.length;i++)
    {
      if(votes==0)
      {
        more = nums[i];
        votes++;
      }
      else
      {
        if(more==nums[i]) votes++;
        else votes--;
      }

    }
    return more;
  }
}
