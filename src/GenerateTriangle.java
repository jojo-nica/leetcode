import java.util.LinkedList;
import java.util.List;

/**
 * @author nica
 * @version 1.0
 */
public class GenerateTriangle {
  public static void main(String[] args) {
    GenerateTriangle generateTriangle = new GenerateTriangle();
    List<List<Integer>> res = generateTriangle.generate(1);
    String fin = res.toString();
    System.out.println(fin);
  }
  public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new LinkedList<>();
        if(numRows == 0)
        {
          return  res;
        }

        for(int row = 0;row<numRows;row++)
        {
          List<Integer> temp = new LinkedList<>();
          for(int i = 0;i<=row;i++)
          {
            if(i == 0 || i == row)
            {
              temp.add(1);
            }
            else
            {
              temp.add(res.get(row-1).get(i-1)+res.get(row-1).get(i));
            }
          }
          res.add(temp);
        }
    return  res;
  }
}
