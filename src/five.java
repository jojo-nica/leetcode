/**
 * @author nica
 * @version 1.0
 */
public class five {
  private int index;
  public static void main(String[] args) {
    five five = new five();
    String income = "3[a]2[bc]";
    String res = five.decodeString(income);
    System.out.println(res);
  }

  public String decodeString(String s) {
        index = 0;
        return decode(s);
  }

  public String decode(String s)
  {
    int num = 0;
    StringBuilder temp = new StringBuilder();
    while(index < s.length())
    {
      char ch = s.charAt(index++);
      if(ch >= '0' && ch <= '9')
      {
        num =   num * 10 +ch - '0';
      }
      else if(ch == '[')
      {
        String str = decode(s);
        for(int i = 0;i<num;i++)
        {
          temp.append(str);
        }
        num = 0;
      }
      else if(ch == ']')
      {
        break;
      }
      else
      {
        temp.append(ch);
      }
    }
    return temp.toString();
  }
}
