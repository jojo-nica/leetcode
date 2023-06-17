import java.util.Scanner;

/**
 * @author nica
 * @version 1.0
 */
public class maxFind {
  public static void main(String[] args) {
    maxFind maxFind = new maxFind();
    Scanner scanner = new Scanner(System.in);
    String numsInput = scanner.nextLine();
    String[] numString = numsInput.split(" ");
    int[] nums = new int[numString.length];
    for(int i=0;i<numString.length;i++)
    {
      nums[i]=Integer.parseInt(numString[i]);
    }
    System.out.println(maxFind.maxProduct(nums));
  }
  public int maxProduct(int[] nums) {
      int max = Integer.MIN_VALUE;
      int tempMax=1;
      int tempMin=1;
      int len = nums.length;
      for(int i=0;i<len;i++)
      {
        if(nums[i]<0)
        {
          int temp=tempMax;
          tempMax=tempMin;
          tempMin=temp;
        }
        tempMax=Math.max(tempMax*nums[i],nums[i]);
        tempMin=Math.min(tempMin*nums[i],nums[i]);

        max=Math.max(tempMax,max);
      }
      return max;
  }
}
