/**
 * @author nica
 * @version 1.0
 */
public class findmin {
  public static void main(String[] args) {
      int[] temp = {3,4,5,1,2};
    findmin findmin = new findmin();

    int res = findmin.findMin(temp);
    System.out.println(res);

  }

  public int findMin(int[] nums) {
    int left = 0;
    int right = nums.length-1;
    while(left<right)
    {
      int mid = left+(right-left)/2;
      if(nums[mid] > nums[right])
      {
        left = mid + 1;
      }
      else
      {
        right = mid;
      }

    }
    return nums[left];
  }
}
