package offer.Tree;

/**
 * @author nica
 * @version 1.0
 */
public class SolutionExist {
  public boolean exist(char[][] board, String word) {
    int m = board.length;
    int n = board[0].length;
    char[] res = word.toCharArray();
    for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      {
        if(existPath(board,res,i,j,0)) return  true;
      }
    }
    return  false;
  }
  boolean existPath(char[][] board,char[] res,int i,int j, int k)
  {
    if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]!=res[k]) return  false;
    if(k==res.length-1) return  true;
    board[i][j]='\0';
    boolean find = existPath(board,res,i+1,j,k+1) || existPath(board,res,i,j+1,k+1) || existPath(board,res,i-1,j,k+1) || existPath(board,res,i,j-1,k+1);
    board[i][j]=res[k];
    return  find;
  }

}
