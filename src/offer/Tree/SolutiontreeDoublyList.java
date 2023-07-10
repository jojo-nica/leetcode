package offer.Tree;

/**
 * @author nica
 * @version 1.0
 */
public class SolutiontreeDoublyList {
  Node pre,head;
  public Node treeToDoublyList(Node root) {
      if(root==null) return  null;
      dfs(root);
      pre.right=head;
      head.left = pre;
      return  head;
  }
  void dfs(Node cur)
  {
    if(cur==null) return;
    dfs(cur.left);
    if(pre == null) head=cur;
    else pre.right=cur;
    cur.left=pre;
    pre=cur;
    dfs(cur.right);

  }

  class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
      val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
      val = _val;
      left = _left;
      right = _right;
    }
  };
}
