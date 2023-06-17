import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author nica
 * @version 1.0
 */
 class Solution {
  public static void main(String[] args) {
    int[] income = {5,7,7,8,8,10};
    int[] res = new int[20];
    Solution solution = new Solution();
    res = solution.searchRange(income,8);
    String arrayString = Arrays.toString(res);
    System.out.println(arrayString);

  }

  public int[] searchRange(int[] nums, int target) {
    int low = 0;
    int high = nums.length-1;
    int left;
    int right;
    boolean flag = false;
    ArrayList<Integer> temp = new ArrayList<>();
    int[] bad = {-1,-1};
    int mid = 0;
    if(nums.length == 0)
    {
      return bad;
    }
    while(low <= high)
    {
      mid = low + (high-low)/2;
      if(nums[mid] == target)
      {
        flag = true;
        temp.add(mid);
        break;
      }
      else if(nums[mid] > target)
      {
        high = mid - 1;
      }
      else{
        low = mid + 1;
      }
    }

    if(flag)
    {
      left = mid - 1;
      right = mid + 1;
      while(left >= 0)
      {
        if(nums[left] != target)
        {
          break;
        }
        else
        {
          temp.add(left--);
        }
      }
      while(right<=nums.length-1)
      {
        if(nums[right] != target)
        {
          break;
        }
        else
        {
          temp.add(right++);
        }
      }
      if(temp.size() == 1)
      {
        int last = temp.get(0);
        temp.add(last);
      }
      Integer[] array = new Integer[temp.size()];
      array = temp.toArray(array);
      int[] intArray = new int[array.length];
      for (int i = 0; i < array.length; i++) {
        intArray[i] = array[i];
      }
      Arrays.sort(intArray);
      int first = intArray[0];
      int last = intArray[intArray.length-1];
      int[] lastres = {first,last};
      return lastres;
    }
    else
    {
      return bad;
    }

  }
}
