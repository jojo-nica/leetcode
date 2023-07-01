package offer.Stirng;

/**
 * @author nica
 * @version 1.0
 */
/*
* 写一个函数 StrToInt，实现把字符串转换成整数这个功能。不能使用 atoi 或者其他类似的库函数。

 

首先，该函数会根据需要丢弃无用的开头空格字符，直到寻找到第一个非空格的字符为止。

当我们寻找到的第一个非空字符为正或者负号时，则将该符号与之后面尽可能多的连续数字组合起来，作为该整数的正负号；假如第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成整数。

该字符串除了有效的整数部分之后也可能会存在多余的字符，这些字符可以被忽略，它们对于函数不应该造成影响。

注意：假如该字符串中的第一个非空格字符不是一个有效整数字符、字符串为空或字符串仅包含空白字符时，则你的函数不需要进行转换。

在任何情况下，若函数不能进行有效的转换时，请返回 0。
*/
public class offer20 {
  public static void main(String[] args) {
    offer20 offer20 = new offer20();
    String input = "";
    System.out.println(offer20.strToInt1(input));
  }
  public int strToInt(String str) {
        StringBuilder sb = new StringBuilder();
        int len = str.length();
        Boolean flag = false;
          int index=0;
          if(str == null)
          {
            return 0;
          }
          for(int i =0;i<len;i++)
          {
            char c =str.charAt(i);
            if(c != ' ')
            {

              if(c =='+'|| c =='-'||Character.isDigit(c))
              {
                index =i;
                break;
              }
              return 0;
            }
          }
          if(str.charAt(index)=='+'||str.charAt(index)=='-')
          {
            flag = true;
          }
          sb.append(str.charAt(index));
          for(int i=index+1;i<len;i++)
          {
            if(flag)
            {
              if(!Character.isDigit(str.charAt(i)))
              {
                return 0;
              }
              flag = false;
            }
            if(!Character.isDigit(str.charAt(i)))
            {
              break;
            }
            sb.append(str.charAt(i));
          }
          String res =sb.toString();
          int result;
          try{
            result = Integer.parseInt(res);
          }catch (ArithmeticException aex)
          {
            return  Integer.MIN_VALUE;
          }

          return result;

  }

  public int strToInt1(String str)
  {
      char[] c = str.trim().toCharArray();
      if(c == null || c.length==0)
      {
        return  0;
      }
      int sign = 1;
      int res = 0;
      int index = 1;
      if(c[0]=='-')
      {
        sign=-1;
      }
      else if(c[0]!='+')
      {
        index=0;
      }
      for(int i=index;i<c.length;i++)
      {
        if(c[i]<'0' || c[i]>'9')
        {
          break;
        }
        int temp = res*10+c[i]-'0';
        if(temp/10 != res)
        {
          return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
        }
        res = temp;
      }
      return res*sign;
  }

}
