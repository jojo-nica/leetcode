package offer.LinkedList;

/**
 * @author nica
 * @version 1.0
 */
public class SolutioncopyRandomList {
/*
* 请实现 copyRandomList 函数，复制一个复杂链表。在复杂链表中，每个节点除了有一个 next 指针指向下一个节点，还有一个 random 指针指向链表中的任意节点或者 null。
*/
  static class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
      this.val = val;
      this.next = null;
      this.random = null;
    }
  }
  public Node copyRandomList(Node head) {
    if(head==null)
    {
      return null;
    }
    //复制链表
    Node cur = head;
    while(cur != null)
    {
      Node temp = new Node(cur.val);
      temp.next = cur.next;
      cur.next = temp;
      cur = temp.next;
    }
    //给复制节点的random赋值
    cur = head;
    while(cur != null)
    {
      if(cur.random == null)
      {
        cur.next.random = null;
      }
      else {
        cur.next.random=cur.random.next;
      }
      cur = cur.next.next;
    }

    //拆分链表
    cur = head;
    Node copy = cur.next;
    Node res = head.next;
    while (cur != null)
    {
      if(copy.next == null)
      {
        cur.next=null;
        break;
      }
      cur.next = copy.next;
      copy.next=copy.next.next;
      cur=cur.next;
      copy=copy.next;
    }
    return res;
  }


}
