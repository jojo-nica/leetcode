package offer.Tree;

/**
 * @author nica
 * @version 1.0
 */
/*
* 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组，求出这个数组中的逆序对的总数。

 

示例 1:

输入: [7,5,6,4]
输出: 5
*/
public class SolutionreversePairs {
  public static void main(String[] args) {
    SolutionreversePairs pairs = new SolutionreversePairs();
    int[] input = {1,3,2,3,1};
    System.out.println(pairs.reversePairs(input));
  }
  int count=0;
  public int reversePairs(int[] nums) {
        this.count=0;
        merge_sort(nums,0,nums.length-1);
        return count;
  }
  void merge_sort(int[]nums,int left,int right)
  {
    if(left>=right) return;
    int mid = left+(right-left)/2;
    merge_sort(nums,left,mid);
    merge_sort(nums,mid+1,right);
    merge(nums,left,mid,right);
  }

  void merge(int[] nums,int left,int mid,int right)
  {
    int[] temp = new int[right-left+1];
    int t=0;
    int i = left;
    int j = mid+1;
    while(i<=mid &&j<=right)
    {
      if(nums[i]<=nums[j])
      {
        temp[t++]=nums[i++];
      }
      else
      {
        count+=mid-i+1;
        temp[t++]=nums[j++];

      }
    }
    while(i<=mid)temp[t++]=nums[i++];
    while(j<=right)temp[t++]=nums[j++];
    System.arraycopy(temp,0,nums,left,temp.length);
  }

}
