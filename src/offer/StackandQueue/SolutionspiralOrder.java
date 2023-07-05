package offer.StackandQueue;

/**
 * @author nica
 * @version 1.0
 */
/*
* 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。

 

示例 1：

输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
输出：[1,2,3,6,9,8,7,4,5]

。*/
public class SolutionspiralOrder {
  public int[] spiralOrder(int[][] matrix) {
       if(matrix.length==0)
       {
         return  new int[]{};
       }
       int top=0;
       int left = 0;
       int right=matrix[0].length-1;
       int bottom=matrix.length-1;
       int max = (right+1)*(bottom+1);
       int[] res = new int[max];
       int num=0;
       while(top<=bottom && left<=right)
       {
         for(int i=left;i<=right;i++) res[num++]=matrix[top][i];
         top++;
         for(int i=top;i<=bottom;i++) res[num++]=matrix[i][right];
         right--;
         for(int i=right;i>=left && top<=bottom;i--) res[num++]=matrix[bottom][i];
         bottom--;
         for(int i=bottom;i>=top && left<=right;i--) res[num++]=matrix[i][left];
         left++;
       }
       return res;


  }
}
