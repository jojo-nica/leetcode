package offer.doublePointer;

/**
 * @author nica
 * @version 1.0
 */
/*
* 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数在数组的前半部分，所有偶数在数组的后半部分。

 

示例：

输入：nums = [1,2,3,4]
输出：[1,3,2,4]
注：[3,1,2,4] 也是正确的答案之一。
*/
public class Solutionexchange {
  public int[] exchange(int[] nums) {
    int len = nums.length;
    int left = 0;
    int right = 1;
    int temp ;
    while(right<len)
    {
      if(nums[left]%2==0 && nums[right]%2!=0)
      {
        temp = nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
        left++;
        right++;
      }
      else if(nums[left]%2==0 && nums[right]%2==0)
      {
        right++;
      }
      else
      {
        left++;
        right++;
      }
    }
    return  nums;
  }
  public int[] exchange2(int[] nums)
  {
    int len = nums.length;
    int left = 0;
    int right = len-1;
    int temp;
    while(left<right)
    {
      while(nums[left]%2!=0 && left<right)
      {
        left++;
      }
      while(nums[right]%2==0 && left<right)
      {
        right--;
      }
        temp = nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }
    return nums;
  }


}
