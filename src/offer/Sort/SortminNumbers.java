package offer.Sort;

import java.util.Arrays;

/**
 * @author nica
 * @version 1.0
 */
/*
* 输入一个非负整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
示例 1:
输入: [10,2]
输出: "102"
示例2:
输入: [3,30,34,5,9]
输出: "3033459"
。*/
public class SortminNumbers {
  public static void main(String[] args) {
    int[] input = {10,2,2147483647,214748364,2147483646};
    System.out.println(minNumber(input));
  }
  public static  String minNumber(int[] nums) {
      String[] strs = new String[nums.length];
      for(int i=0;i<nums.length;i++)
      {
        strs[i]=String.valueOf(nums[i]);
      }
      quickSort(strs,0,nums.length-1);
    StringBuilder builder = new StringBuilder();
    for(String str:strs)
    {
      builder.append(str);
    }
    return builder.toString();
  }
  static void quickSort(String[] nums,int left,int right)
  {
      if(left<right)
      {
        int pivot = doSort(nums,left,right);
        quickSort(nums,left,pivot-1);
        quickSort(nums,pivot+1, right);
      }
  }
  static  int doSort(String[] nums,int left,int right)
  {
    String pivot = nums[left];
    while(left<right)
    {
      while(left<right&&(nums[right] + pivot).compareTo(pivot + nums[right]) >= 0)
      {
        right--;
      }
      nums[left]=nums[right];
      while(left<right&&(nums[left] + pivot).compareTo(pivot + nums[left]) <= 0)
      {
        left++;
      }
      nums[right]=nums[left];
    }
    nums[left]=pivot;
    return left;
  }

}
