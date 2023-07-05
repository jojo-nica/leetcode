package offer.Search;

import java.util.HashSet;

/**
 * @author nica
 * @version 1.0
 */
/*
* 找出数组中重复的数字。


在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
* 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。

示例 1：

输入：
[2, 3, 1, 0, 2, 5, 3]
输出：2 或 3
。*/
public class SolutionFindRepeatNumber {
  //哈希表
  public int findRepeatNumber(int[] nums) {

      int len = nums.length;
    HashSet<Integer> set = new HashSet<>();
    int i=0;
      while(i<len)
      {
        if(!set.isEmpty() && set.contains(nums[i]))
        {
          return nums[i];
        }
        set.add(nums[i++]);
      }
      return -1;
  }
  //原地置换
  //如题意可知，数组里的数是和索引0-n-1对应的，也就是索引对应着数值
  //把数值存在索引上
  public int findRepeatNumber1(int[] nums)
  {
    int len = nums.length;
    int i = 0;
    while(i < len)
    {
      //数字在索引该在的位置
      if(nums[i]  == i)
      {
        i++;
        continue;
      }
      //数字不在索引对应的位置，要将该数字移到对应索引的位置
      if(nums[i]  ==  nums[nums[i]])
      {
        return nums[i];
      }
      int temp  = nums[i];
      nums[i] = nums[temp];
      nums[temp]  = temp;
    }
    return  -1;
  }
}
