/**
 * @author nica
 * @version 1.0
 */
public class Jump {
  public boolean canJump(int[] nums) {
        int rightmost = 0;
        for(int i = 0;i<nums.length;i++)
        {
          if(i<=rightmost)
          {
            rightmost = Math.max(rightmost,i+nums[i]);
            if(rightmost >= nums.length-1)
            {
              return true;
            }
          }
        }
        return  false;
  }
}
