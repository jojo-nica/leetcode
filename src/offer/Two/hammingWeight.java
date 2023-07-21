package offer.Two;

/**
 * @author nica
 * @version 1.0
 */
public class hammingWeight {
  public static void main(String[] args) {

  }
  public static int hammingWeight(int n) {
      int res = 0;
      while(n!=0)
      {
        res+=n&1;
        n>>>=1;
      }
      return  res;
  }
}
