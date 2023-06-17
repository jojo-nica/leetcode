/**
 * @author nica
 * @version 1.0
 */
public class search {
  public static void main(String[] args) {
    int[] test = {1,3};
    int target = 3;
    int res;
    search search = new search();
    res = search.find(test,target);
    System.out.println(res);
  }
  public int find(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        while(left<=right)
        {
          int mid = left + (right-left)/2;
          if(nums[mid] == target)
          {
            return  mid;
          }
          else if(nums[mid]>nums[right])
          {
            if(target < nums[mid] && target >= nums[left])
            {
                right = mid - 1;
            }
            else
            {
              left = mid + 1;
            }
          }
          else
          {
            if(target <= nums[right] && target > nums[mid])
            {
                left = mid + 1;
            }
            else
            {
              right = mid - 1;
            }
          }
        }
        return -1;


  }


}
