package offer.StackandQueue;

import java.util.LinkedList;

/**
 * @author nica
 * @version 1.0
 */
/*
* 请定义一个队列并实现函数 max_value 得到队列里的最大值，要求函数max_value、push_back 和 pop_front 的均摊时间复杂度都是O(1)。

若队列为空，pop_front 和 max_value 需要返回 -1
*/
public class SolutionMaxQueue {
  class MaxQueue {
    LinkedList<Integer> res;
    LinkedList<Integer> max;
    public MaxQueue() {
        res = new LinkedList<>();
        max = new LinkedList<>();
    }

    public int max_value() {
      if(res.isEmpty()) return -1;
      return max.peekFirst();
    }

    public void push_back(int value) {
        res.addLast(value);
        while(!max.isEmpty() && max.peekLast()<value) max.removeLast();
        max.addLast(value);
    }

    public int pop_front() {
          if(res.isEmpty())
          {
            return  -1;
          }
          int temp = res.peekFirst();
          if(temp == max.peekFirst())
          {

            max.removeFirst();
          }
          res.removeFirst();
          return temp;
    }
  }
}
