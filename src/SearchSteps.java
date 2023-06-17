/**
 * @author nica
 * @version 1.0
 */
public class SearchSteps {
  public int jump(int[] nums) {
    int step=0;
    int curr=0;
    int currmost=0;
    for(int i = 0;i<nums.length;i++)
    {
      if(currmost < i + nums[i])
      {
        currmost = i + nums[i];
        if(currmost >= nums.length-1)
        {
          return  step+1;
        }
      }
      if(curr == i)
      {
        curr = currmost;
        step++;
      }

    }
    return -1;
  }
}
