package offer.StackandQueue;

import java.util.Stack;

/**
 * @author nica
 * @version 1.0
 */
public class SolutionCqueue {
  /*
  * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )

。*/
  class CQueue {
    int value;
    Stack<Integer> a, b;

    public CQueue() {
      a = new Stack();
      b = new Stack();
    }

    public void appendTail(int value) {
      a.push(value);
    }

    public int deleteHead() {
      while (!b.isEmpty()) {
        return b.pop();
      }
      if (a.isEmpty()) return -1;
      while (!a.isEmpty()) {
        b.push(a.pop());
      }
      return b.pop();
    }
  }
}

