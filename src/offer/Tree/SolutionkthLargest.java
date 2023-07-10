package offer.Tree;

import java.util.LinkedList;

/**
 * @author nica
 * @version 1.0
 *//*
 给定一棵二叉搜索树，请找出其中第 k 大的节点的值。*/
public class SolutionkthLargest {
  int res,count;
  public int kthLargest(TreeNode root, int k) {
        this.count=k;
        dfs(root);
        return  this.res;
  }
  void dfs(TreeNode root)
  {
      if(root==null) return;
      dfs(root.right);
      if(--count==0)
      {
        this.res=root.val;
        return;
      }
      dfs(root.left);
  }

  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
