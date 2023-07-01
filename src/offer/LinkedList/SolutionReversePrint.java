package offer.LinkedList;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author nica
 * @version 1.0
 */
/*
* 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。



示例 1：

输入：head = [1,3,2]
输出：[2,3,1]*/
public class SolutionReversePrint {

  public int[] reversePrint1(ListNode head) {
    int len =0;
    Stack<Integer> temp = new Stack<>();
    while(head!=null)
    {
      temp.push(head.val);
      head = head.next;
      len++;
    }
    int[] res = new int[len];
    for(int i=0;i<len;i++)
    {
      res[i]=temp.peek();
      temp.pop();
    }
    return res;
  }

   public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

  public int[] reversePrint(ListNode head)
  {
    ListNode temp = head;
    if(head==null)
    {
      return new int[]{};
    }
    int len=0;
    while(temp !=null)
    {
      temp=temp.next;
      len++;
    }
    int[] res = new int[len];
    for(int i=len-1;i>=0;i--)
    {
      res[i]=head.val;
      head=head.next;
    }
    return res;
  }





}
