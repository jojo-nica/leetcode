/**
 * @author nica
 * @version 1.0
 */
public class canPa {
  public boolean canPartition(int[] nums) {
        int len = nums.length;
        int sum=0;
        for(int num:nums)
        {
          sum += num;
        }
        if(sum%2!=0)
        {
          return  false;
        }
        int target = sum/2;
        boolean[][] temp = new boolean[len][target+1];
        if(nums[0]<=target)
        {
          temp[0][nums[0]]=true;
        }


        for(int i=1;i<len;i++)
        {
          for(int j=0;j<=target;j++)
          {
            temp[i][j]=temp[i-1][j];
            if(nums[i]==j)
            {
              temp[i][j]=true;
              continue;
            }
            if(nums[i]<j)
            {
              temp[i][j] = temp[i-1][j] || temp[i-1][j-nums[i]];
            }
          }
        }
        return temp[len-1][target];
  }
}
