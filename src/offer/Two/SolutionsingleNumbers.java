package offer.Two;

import java.util.Arrays;

/**
 * @author nica
 * @version 1.0
 */
/*
* 一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。

 

示例 1：

输入：nums = [4,1,4,6]
输出：[1,6] 或 [6,1]
示例 2：

输入：nums = [1,2,10,4,1,4,3,3]
输出：[2,10] 或 [10,2]
。*/
public class SolutionsingleNumbers {
  public static void main(String[] args) {
    int[] input = {1,2,10,4,1,4,3,3};
    System.out.println(Arrays.toString(singleNumbers(input)));
  }
  public static int[] singleNumbers(int[] nums) {
      int temp=0;
      int a=0,b=0;
      for(int num:nums)
      {
        temp^=num;
      }
      int mask =1;
      while((mask&temp)==0)
      {
        mask<<=1;
      }
      for(int i=0;i<nums.length;i++)
      {
        if((mask&nums[i])==0) a^=nums[i];
        else  b^=nums[i];
      }
      return  new int[]{a,b};
  }
}
