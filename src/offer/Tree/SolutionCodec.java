package offer.Tree;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author nica
 * @version 1.0
 */
/*
* 请实现两个函数，分别用来序列化和反序列化二叉树。

你需要设计一个算法来实现二叉树的序列化与反序列化。这里不限定你的序列 / 反序列化算法执行逻辑，
* 你只需要保证一个二叉树可以被序列化为一个字符串并且将这个字符串反序列化为原始的树结构。
*/
public class SolutionCodec {

  public String serialize(TreeNode root) {
    if(root ==null) return "[]";
    LinkedList<TreeNode> deque = new LinkedList<>();
    StringBuilder res = new StringBuilder("[");
    deque.addLast(root);
    while(!deque.isEmpty())
      {
          TreeNode temp = deque.removeFirst();
          if(temp!=null)
          {
            res.append(temp.val).append(",");
            deque.addLast(temp.left);
            deque.addLast(temp.right);
          }
          else
          {
            res.append("null").append(",");
          }
      }
      res.deleteCharAt(res.length()-1);
      res.append("]");
      return res.toString();
  }

  // Decodes your encoded data to tree.
  public TreeNode deserialize(String data) {
        if(data.equals("[]")) return null;
        String[] res = data.substring(1,data.length()-1).split(",");
        TreeNode root = new TreeNode(Integer.parseInt(res[0]));
        LinkedList<TreeNode> list = new LinkedList<>();
        list.addLast(root);
        int i=1;
        while(!list.isEmpty())
        {
          TreeNode node = list.removeFirst();
          if(!res[i].equals("null"))
          {
            node.left = new TreeNode(Integer.parseInt(res[i]));
            list.addLast(node.left);
          }
          i++;
          if(!res[i].equals("null"))
          {
            node.right = new TreeNode(Integer.parseInt(res[i]));
            list.addLast(node.right);
          }
        }
        return  root;
  }
   class TreeNode {
     int val;
     TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
