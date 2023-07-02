package offer.doublePointer;

/**
 * @author nica
 * @version 1.0
 */
/*
* 输入两个链表，找出它们的第一个公共节点。*/
public class SolutiongetIntersectionNode {
  public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
  }
  ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode fast = headA;
            ListNode slow = headB;
            if(headA == null || headB==null)
            {
              return  null;
            }
            int a = 0;
            int b = 0;
            while(fast != slow)
            {
              if(a==2 || b ==2)
              {
                return null;
              }
              if(fast.next == null)
              {
                fast = headB;
                a++;
              }
              else
              {
                fast = fast.next;
              }
              if(slow.next == null)
              {
                slow = headA;
                b++;
              }
              else
              {
                slow = slow.next;
              }
            }

            return  fast;
  }
  ListNode getIntersectionNode1(ListNode headA, ListNode headB)
  {

    if(headA == null || headB == null)
    {
      return  null;
    }
    ListNode n1 = headA;
    ListNode n2 = headB;
    while(n1 != n2)
    {
      n1 = n1==null?headB:n1.next;
      n2 = n2==null?headA:n2.next;
    }
    return  n1;
  }

}
