/**
 * @author nica
 * @version 1.0
 */
//替换空格
public class replace {
  public String replaceSpace(String s) {
    StringBuilder res = new StringBuilder();
    for(int i=0;i<s.length();i++)
    {
      if(s.charAt(i)!=' ')
      {
        res.append("%20");
      }
      else
      {
        res.append(s.charAt(i));
      }
    }
    return res.toString();
  }
}
