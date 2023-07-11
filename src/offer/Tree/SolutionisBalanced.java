package offer.Tree;

/**
 * @author nica
 * @version 1.0
 */
/*
* 输入一棵二叉树的根节点，判断该树是不是平衡二叉树。
* 如果某二叉树中任意节点的左右子树的深度相差不超过1，那么它就是一棵平衡二叉树。
* [1,2,2,3,null,null,3,4,null,null,4]*/
public class SolutionisBalanced {
  public boolean isBalanced(TreeNode root) {
    /*if(root == null) return true;
    if(Math.abs(Treehight(root.left)-Treehight(root.right))<=1)
    {
      return isBalanced(root.right) && isBalanced(root.left);
    }
    return  false;*/
    return dfs(root) != -1;

  }
  int Treehight(TreeNode root)
  {
    if(root==null) return 0;
    return Math.max(Treehight(root.left),Treehight(root.right))+1;
  }
  int dfs(TreeNode treeNode)
  {
    if(treeNode==null) return  0;
    int left = dfs(treeNode.left);
    if(left == -1) return  -1;
    int right = dfs(treeNode.right);
    if(right == -1) return  -1;
    return Math.abs(right-left)<2?Math.max(left,right)+1:-1;
  }


   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
