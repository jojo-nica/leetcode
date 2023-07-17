package offer.Sort;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * @author nica
 * @version 1.0
 */
public class MedianFinder {
  PriorityQueue<Integer> maxHeap;
  PriorityQueue<Integer> minHeap;

  public MedianFinder() {
  maxHeap = new PriorityQueue<Integer>((x,y) -> (y-x));
  minHeap = new PriorityQueue<Integer>();
  }

  public void addNum(int num) {
      if(maxHeap.size() != minHeap.size())
      {
        minHeap.add(num);
        maxHeap.add(minHeap.poll());
      }
      else
      {
        maxHeap.add(num);
        minHeap.add(maxHeap.poll());
      }
  }

  public double findMedian() {
        if(maxHeap.size()!=minHeap.size()) return minHeap.peek();
        else  return (maxHeap.peek()+minHeap.peek())/2.0;
  }


}
