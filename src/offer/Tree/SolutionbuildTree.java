package offer.Tree;

import java.util.HashMap;

/**
 * @author nica
 * @version 1.0
 */
/*
* 输入某二叉树的前序遍历和中序遍历的结果，请构建该二叉树并返回其根节点。

假设输入的前序遍历和中序遍历的结果中都不含重复的数字。*/
public class SolutionbuildTree {
  int[] preorder;
  HashMap<Integer,Integer> map = new HashMap<>();
  public TreeNode buildTree(int[] preorder, int[] inorder) {
      this.preorder=preorder;
      for(int i=0;i<inorder.length;i++)
      {
        map.put(inorder[i],i);
      }
      return recur(0,0,inorder.length-1);
  }
  TreeNode recur(int root,int left,int right)
  {
    if(left>right) return  null;
    TreeNode res= new TreeNode(preorder[root]);
    int i = map.get(preorder[root]);
    res.left = recur(root+1,left,i-1);
    res.right = recur(root+i-left+1,i+1,right);
    return res;
  }
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
     TreeNode(int x) { val = x; }
  }
}
