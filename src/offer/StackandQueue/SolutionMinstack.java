package offer.StackandQueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author nica
 * @version 1.0
 */
/*
* 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。

 

示例:

MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.min();   --> 返回 -3.
minStack.pop();
minStack.top();      --> 返回 0.
minStack.min();   --> 返回 -2.
*/
public class SolutionMinstack {
  class MinStack {

    Stack<Integer> nor;
    Stack<Integer> min;
    /** initialize your data structure here. */
    public MinStack() {
        nor = new Stack<>();
        min = new Stack<>();
        min.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
          nor.push(x);
          min.push(Math.min(min.peek(),x));
    }

    public void pop() {

          nor.pop();
          min.pop();


    }

    public int top() {
          return nor.peek();
    }

    public int min() {
        return min.peek();
    }
  }
}
