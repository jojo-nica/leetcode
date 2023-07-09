package offer.Tree;

import java.util.LinkedList;
import java.util.List;

/**
 * @author nica
 * @version 1.0
 */
public class SolutionpathSum {
  LinkedList<List<Integer>> res = new LinkedList<>();
  LinkedList<Integer> path = new LinkedList<>();
  public List<List<Integer>> pathSum(TreeNode root, int target) {
      find(root,target);
      return  res;
  }
  void find(TreeNode root,int target)
  {
    if(root==null) return;
    path.add(root.val);
    target -=root.val;
    if(target==0 && root.left == null && root.right==null) res.add(new LinkedList<>(path));
    find(root.left,target);
    find(root.right,target);
    path.removeLast();
  }

  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
}
