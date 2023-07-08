package offer.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author nica
 * @version 1.0
 */
/*
* 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。

 

例如:
给定二叉树: [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
返回：

[3,9,20,15,7]
。*/
public class SolutionlevelOrder {
  public int[] levelOrder(TreeNode root) {
    if(root == null) return  new int[]{};
    LinkedList<TreeNode> deque = new LinkedList<>();
    ArrayList<Integer> arrayList = new ArrayList<>();
    deque.add(root);
    while(!deque.isEmpty())
    {
      TreeNode temp = deque.poll();
      arrayList.add(temp.val);
      if(temp.left != null) deque.add(temp.left);
      if(temp.right != null) deque.add(temp.right);
    }
    int[] res = new int[arrayList.size()];
    int index = 0;
    for(int i:arrayList)
    {
      res[index++]=i;
    }
    return  res;
  }
  public class TreeNode {
      int val;
     TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
