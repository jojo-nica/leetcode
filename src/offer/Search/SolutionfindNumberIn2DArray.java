package offer.Search;

/**
 * @author nica
 * @version 1.0
 */
/*
* 在一个 n * m 的二维数组中，每一行都按照从左到右 非递减 的顺序排序，每一列都按照从上到下 非递减 的顺序排序。请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。

 

示例:

现有矩阵 matrix 如下：

[
  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]
]
。*/
public class SolutionfindNumberIn2DArray {
  public boolean findNumberIn2DArray(int[][] matrix, int target) {
      int row = matrix.length;
      if(row==0)
      {
        return false;
      }
      int column = matrix[0].length;
      int i=0;
      int j=column-1;
      while(i<row && j>=0)
      {
        if(matrix[i][j]==target)
        {
          return true;
        }
        else if(matrix[i][j]>target)
        {
          j--;
        }
        else {
          i++;
        }
      }
      return false;

  }
}
