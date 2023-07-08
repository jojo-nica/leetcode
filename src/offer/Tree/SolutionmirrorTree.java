package offer.Tree;

import java.util.Stack;

/**
 * @author nica
 * @version 1.0
 */
/*
* 请完成一个函数，输入一个二叉树，该函数输出它的镜像。*/
public class SolutionmirrorTree {
  public TreeNode mirrorTree(TreeNode root) {
    if(root==null) return  null;
    Stack<TreeNode> stack = new Stack<>();
    stack.add(root);
    while (!stack.isEmpty())
    {
      TreeNode node = stack.pop();
      if(node.left != null) stack.push(node.left);
      if(node.right != null) stack.push(node.right);
      TreeNode temp = node.left;
      node.left = node.right;
      node.right = temp;
    }
    return  root;

  }
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
