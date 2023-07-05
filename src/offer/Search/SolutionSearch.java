package offer.Search;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author nica
 * @version 1.0
 */
/*
* 统计一个数字在排序数组中出现的次数。



示例 1:

输入: nums = [5,7,7,8,8,10], target = 8
输出: 2*/
public class SolutionSearch {
  public static void main(String[] args) {
    SolutionSearch search = new SolutionSearch();
    int[] nums = {5,7,7,8,8,10};
    int target = 8;
    int out = search.search(nums,target);
    System.out.println(out);
  }
  public int search(int[] nums, int target)
  {
    int len = nums.length;
    int i = 0,j=len-1;
    int left,right;
    while(i<=j)
    {
      int mid = i+(j-i)/2;
      if(nums[mid]<=target) i=mid+1;
      else j=mid-1;
    }
    right = i;
    if(j>=0 && nums[j] != target) return  0;
    i = 0;
    j = len-1;
    while(i<=j)
    {
      int mid = i+(j-i)/2;
      if(nums[mid]<target)i=mid+1;
      else j=mid-1;
    }
    left = j;
    return right-left-1;
  }
  public int search1(int[] nums, int target)
  {
    int len = nums.length;
    int low = 0;
    int high = len-1;
    int pos=0;
    int count = 0;
    while(low <= high)
    {
      int mid = low + (high-low)/2;
      if(nums[mid]==target)
      {
        pos = mid;
        count=1;
        break;
      }
      else if(nums[mid]>target)
      {
        high = mid-1;
      }
      else
      {
        low = mid+1;
      }
    }
    if(pos==-1)
    {
      return  count;
    }
    for(int i=pos+1;i<len;i++)
    {
      if(nums[i]!=target)break;
      count++;
    }
    for(int i=pos-1;i>=0;i--)
    {
      if(nums[i]!=target)break;
      count++;
    }
    return  count;
  }



}
