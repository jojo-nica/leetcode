package offer.Tree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author nica
 * @version 1.0
 */
/*
* 从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行*/
public class Solutionlevelorder2 {
  public List<List<Integer>> levelOrder(TreeNode root) {
    LinkedList<TreeNode> deque = new LinkedList<>();
    List<List<Integer>> arrayList = new ArrayList<>();
    if(root != null) deque.add(root);
    else return  new ArrayList<>(new ArrayList<>());
    while(!deque.isEmpty())
    {
      List<Integer> temp = new ArrayList<>();
      for(int i=deque.size();i>0;i--)
      {
        TreeNode pre = deque.poll();
        temp.add(pre.val);
        if(pre.left != null) deque.add(pre.left);
        if(pre.right != null) deque.add(pre.right);
      }
      arrayList.add(temp);
    }
    return  arrayList;
  }
  public class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
