import java.util.Stack;

/**
 * @author nica
 * @version 1.0
 */
public class printlink {
  public int[] reversePrint(ListNode head) {
    Stack<Integer> stack = new Stack<Integer>();
    while(head!=null)
    {
      stack.push(head.val);
      head=head.next;
    }
    int[] res = new int[stack.size()];
    for(int i=0;i<stack.size();i++)
    {
      res[i]=stack.pop();
    }
    return  res;
  }
}

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
  }
