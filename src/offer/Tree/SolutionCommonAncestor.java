package offer.Tree;

/**
 * @author nica
 * @version 1.0
 */
public class SolutionCommonAncestor {
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
      if(root==null || root==p || root==q)return  root;
      TreeNode left = lowestCommonAncestor(root.left,p,q);
      TreeNode right = lowestCommonAncestor(root.right,p,q);
      if(left == null && right==null)return  null;
      else if(left ==null && right !=null) return  root.right;
      else if(left !=null && right==null) return  root.left;
      else   return  root;

  }
   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
