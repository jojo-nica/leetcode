package offer.Tree;

/**
 * @author nica
 * @version 1.0
 */
/*
* 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历结果。
* 如果是则返回 true，否则返回 false。假设输入的数组的任意两个数字都互不相同。*/
public class SolutionverifyPostorder {
  int[] postorder;
  public boolean verifyPostorder(int[] postorder) {
      this.postorder=postorder;
      return verify(0,postorder.length-1);
  }
  boolean verify(int left,int right)
  {
    boolean change = false;
    if(left>=right) return  true;
    int root = postorder[right];
    int postFirst=left;
    for(int i=left;i<right;i++)
    {
      if(postorder[i]>root)
      {
        postFirst=i;
        change = true;
        break;
      }
    }
    if(!change)
    {
      return verify(left,right-1);
    }
    for(int i=postFirst;i<right;i++)
    {
      if(postorder[i]<root) return false;
    }
    return verify(left,postFirst-1) && verify(postFirst,right-1);
  }

}
