package offer.doublePointer;

/**
 * @author nica
 * @version 1.0
 */
/*给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。

返回删除后的链表的头节点。

注意：此题对比原题有改动

示例 1:

输入: head = [4,5,1,9], val = 5
输出: [4,1,9]
解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
。*/
public class SolutionDeletenode {
  public ListNode deleteNode(ListNode head, int val) {
      ListNode cur = head;
      ListNode prev = head;
      if(cur.val==val)
      {
        head = head.next;
        cur.next = null;
        return  head;
      }
      cur = cur.next;
      while (cur!=null)
      {
        if(cur.val==val)
        {
          prev.next = cur.next;
          cur.next=null;
          return head;
        }
        cur=cur.next;
        prev = prev.next;
      }
      return  head;
  }
  public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
}
