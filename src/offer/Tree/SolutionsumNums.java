package offer.Tree;

/**
 * @author nica
 * @version 1.0
 */
public class SolutionsumNums {
  int res;
  public int sumNums(int n) {
    boolean x = n>1 && sumNums(n-1)>0;
    res+=n;
    return  res;
  }
}
