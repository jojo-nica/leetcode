package offer.Sort;

import java.util.Arrays;

/**
 * @author nica
 * @version 1.0
 */
/*
* 从若干副扑克牌中随机抽 5 张牌，判断是不是一个顺子，即这5张牌是不是连续的。
* 2～10为数字本身，A为1，J为11，Q为12，K为13，而大、小王为 0 ，可以看成任意数字。A 不能视为 14。
示例 1:
输入: [1,2,3,4,5]
输出: True
 

示例 2:

输入: [0,0,1,2,5]
输出: True
。*/
public class isStraight {
  public static void main(String[] args) {
    isStraight isStraight = new isStraight();
    int[] input = {1,2,3,4,5};
    System.out.println(isStraight.Straight(input));
  }
  public boolean Straight(int[] nums) {
      int joker = 0;
    Arrays.sort(nums);
      for(int i=0;i<4;i++)
      {
        if(nums[i]==0) joker++;
        else if(nums[i]==nums[i+1]) return false;
      }
      return nums[4]-nums[joker]<5;
  }
}
