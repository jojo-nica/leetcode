package offer.LinkedList;

/**
 * @author nica
 * @version 1.0
 */
public class SolutionReverseList {
  public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode temp ;
        while(head != null)
        {
          temp = head.next;
          head.next = prev;
          prev = head;
          head = temp;
        }
        return  prev;
  }
  public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
}
