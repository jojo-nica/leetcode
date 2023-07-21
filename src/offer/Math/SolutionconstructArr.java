package offer.Math;

import java.util.Arrays;

/**
 * @author nica
 * @version 1.0
 */
/*
* 给定一个数组 A[0,1,…,n-1]，请构建一个数组 B[0,1,…,n-1]，
* 其中B[i] 的值是数组 A 中除了下标 i 以外的元素的积, 即B[i]=A[0]×A[1]×…×A[i-1]×A[i+1]×…×A[n-1]。不能使用除法。

 

示例:

输入: [1,2,3,4,5]
输出: [120,60,40,30,24]
。*/
public class SolutionconstructArr {
  public static void main(String[] args) {
    int[] input = {1,2,3,4,5};
    System.out.println(Arrays.toString(constructArr(input)));
  }
  public static int[] constructArr(int[] a) {
    if(a.length==0) return  new int[]{};
    int[] b = new int[a.length];
    int[] left=new int[a.length];
    int[] right = new int[a.length];
    left[0]=right[a.length-1]=1;
    for(int i=1;i<a.length;i++)
    {
      left[i]=left[i-1]*a[i-1];
    }
    for(int j=a.length-2;j>=0;j--)
    {
      right[j]=right[j+1]*a[j+1];
    }
    for(int k=0;k<a.length;k++)
    {
      b[k]=left[k]*right[k];
    }
    return b;
  }
}
