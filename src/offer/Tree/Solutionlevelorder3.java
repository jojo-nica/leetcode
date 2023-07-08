package offer.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author nica
 * @version 1.0
 */
/*
* 请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，
* 第三行再按照从左到右的顺序打印，其他行以此类推。
* 给定二叉树: [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
返回其层次遍历结果：

[
  [3],
  [20,9],
  [15,7]
]。v*/
public class Solutionlevelorder3 {
  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> list = new ArrayList<>();
    LinkedList<TreeNode> deque = new LinkedList<>();
    if(root == null) return  new ArrayList<>();
    else  deque.add(root);
    //记录层数
    int count = 1;
    while(!deque.isEmpty())
    {
      LinkedList<Integer> temp = new LinkedList<>();
      for(int i=deque.size();i>0;i--)
      {
        TreeNode prev = deque.poll();
        if(count%2 ==0) temp.addFirst(prev.val);
        else  temp.add(prev.val);
        if(prev.left!=null)deque.add(prev.left);
        if(prev.right!=null)deque.add(prev.right);

      }
      count++;
      list.add(temp);
    }
    return list;
  }
  public class TreeNode {
     int val;
     TreeNode left;
      TreeNode right;
     TreeNode(int x) { val = x; }
  }
}
