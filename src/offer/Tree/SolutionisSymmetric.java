package offer.Tree;

/**
 * @author nica
 * @version 1.0
 */
public class SolutionisSymmetric {
  public boolean isSymmetric(TreeNode root) {
      if(root == null) return  true;
      return  recur(root.left,root.right);

  }
  boolean recur(TreeNode L, TreeNode R)
  {
    if(L==null&&R==null) return  true;
    if(L == null || R == null || L.val != R.val) return  false;
    return  recur(L.right,R.left)&&recur(L.left,R.right);
  }

  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
     TreeNode(int x) { val = x; }
  }
}
