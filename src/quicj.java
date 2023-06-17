import java.util.Random;

/**
 * @author nica
 * @version 1.0
 */
public class quicj {
  public static void main(String[] args) {
    quicj quicj = new quicj();
    int[] income = {3,2,3,1,2,4,5,5,6};
    int k = 4;
    System.out.println(quicj.quicksort(income,k));

  }
  private final static Random random = new Random(System.currentTimeMillis());

  public int quicksort(int[] nums,int k)
  {
    int len = nums.length;
    int target = len-k;
    int left = 0;
    int right = len-1;
    while(left<=right)
    {
      int index = partition(left,right,nums);
      if(index == target)
      {
        return  nums[index];
      }
      else if(target > index)
      {
        left = index+1;
      }
      else
      {
        right = index - 1;
      }
    }
    return -1;
  }

  public int partition(int left,int right,int[] nums)
  {
    int randomIndex = left + random.nextInt(right - left + 1);
    swap(left,randomIndex,nums);
    int le = left+1;
    int ge = right;
    while(true)
    {
        while(le <= ge && nums[le] < nums[left])
        {
          le++;
        }
        while(le <= ge && nums[ge] > nums[left])
        {
          ge--;
        }
        if(le >= ge)
        {
          break;
        }
        swap(le,ge,nums);
        le++;
        ge--;
    }
    swap(left,ge,nums);
    return  ge;
  }

  public void swap(int left,int right,int[] nums)
  {
    int temp = nums[left];
    nums[left] = nums[right];
    nums[right] = temp;

  }


}
