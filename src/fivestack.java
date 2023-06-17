import java.util.Arrays;
import java.util.Stack;

/**
 * @author nica
 * @version 1.0
 */
public class fivestack {
  public static void main(String[] args) {
    fivestack fivestack = new fivestack();
    int[] income = {30,60,90};
    int[] res = fivestack.dailyTemperatures(income);
    String arrayString = Arrays.toString(res);
    System.out.println(arrayString);

  }
  public int[] dailyTemperatures(int[] temperatures) {
    Stack<Integer> temp = new Stack<>();
    int[] res = new int[temperatures.length];
    temp.push(0);

    for(int i = 1;i < temperatures.length;i++)
    {
      if(temperatures[i] <= temperatures[temp.peek()])
      {
        temp.push(i);
      }
      else
      {
        while(!temp.isEmpty() && temperatures[i] > temperatures[temp.peek()])
        {
          res[temp.peek()] = i-temp.peek();
          temp.pop();
        }
        temp.push(i);
      }
    }
    return res;
  }
}
