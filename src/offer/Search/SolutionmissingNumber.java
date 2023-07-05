package offer.Search;

/**
 * @author nica
 * @version 1.0
 */
/*
* 一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。
* 在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。

 

示例 1:

输入: [0,1,3]
输出: 2
*/
public class SolutionmissingNumber {
  public int missingNumber(int[] nums) {
    int i = 0;
    int j = nums.length-1;
    while(i<=j)
    {
      int mid = i+(j-i)/2;
      if(nums[mid]==mid) i=mid+1;
      else j=mid-1;
    }
    return i;
  }
}
