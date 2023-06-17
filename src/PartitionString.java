import java.util.ArrayList;
import java.util.List;

/**
 * @author nica
 * @version 1.0
 */
public class PartitionString {
  public static void main(String[] args) {
    String s = "ababcbacadefegdehijhklij";
    PartitionString partitionString = new PartitionString();
    String res = partitionString.partitionLabels(s).toString();
    System.out.println(res);
  }
  public List<Integer> partitionLabels(String s)
  {
    int[] last = new int[26];
    int start = 0;
    int end = 0;
    List<Integer> res = new ArrayList<>();
    for(int i = 0; i<s.length();i++)
    {
      last[s.charAt(i) - 'a'] = i;
    }



      for(int i = 0;i<s.length();i++)
      {
        end = Math.max(last[s.charAt(i)-'a'],end );
        if(i==end)
        {
          res.add(end-start+1);
          start = end+1;
        }
      }




    return  res;
  }

}
