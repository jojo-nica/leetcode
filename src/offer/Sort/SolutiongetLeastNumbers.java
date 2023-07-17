package offer.Sort;

import java.util.Arrays;

/**
 * @author nica
 * @version 1.0
 */
/*
* 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
示例 1：
输入：arr = [3,2,1], k = 2
输出：[1,2] 或者 [2,1]
示例 2：

输入：arr = [0,1,2,1], k = 1
输出：[0]
*/
public class SolutiongetLeastNumbers {
  public static void main(String[] args) {
    SolutiongetLeastNumbers leastNumbers = new SolutiongetLeastNumbers();
    int[] input = {3,2,1};
    int k = 2;
    System.out.println(Arrays.toString(leastNumbers.getLeastNumbers(input, k)));
  }
  int k;
  public int[] getLeastNumbers(int[] arr, int k) {
      this.k=k;
      int[] res = new int[k];
      quickSort(arr,0,arr.length-1);
      for(int i=0;i<k;i++)
      {
        res[i]=arr[i];
      }
      return res;
  }
  void quickSort(int[] arr,int left,int right)
  {
    if(left<right)
    {
      int pivot = doSort(arr,left,right);
      if(pivot == k) return;
      if(k<pivot)quickSort(arr,left,pivot-1);
      if(k>pivot)quickSort(arr,pivot+1,right);
    }
  }

  int doSort(int[] arr,int left,int right)
  {
    int temp = arr[left];
    while(left<right)
    {
      while(left<right && arr[right]>temp) right--;
      arr[left]=arr[right];
      while(left<right && arr[left]<=temp) left++;
      arr[right]=arr[left];
    }
    arr[left]=temp;
    return left;
  }


}
