package offer.Tree;

/**
 * @author nica
 * @version 1.0
 */
public class SolutionlowestCommonAncestor {
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
      while(root!=null)
      {
        if(p.val>root.val && q.val>root.val) root=root.right;
        else if(p.val<root.val && q.val<root.val) root=root.left;
        else break;
      }
      return  root;
  }
  boolean findTree(TreeNode root,TreeNode node)
  {
    if(root == null) return  false;
    if(root == node) return  true;
    return findTree(root.left,node) || findTree(root.right,node);
  }


  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
