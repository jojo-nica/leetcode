import java.util.Scanner;

/**
 * @author nica
 * @version 1.0
 */
public class findminString {
  public static void main(String[] args) {
    findminString findminString = new findminString();
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    while(input.equals("."))
    {
      int res =findminString.findMin(input);
      System.out.println(res);
      input = scanner.nextLine();
    }



  }

  public int findMin(String s) {
    int length = s.length();
    String temp;

    int i=0;
    while (i < length ) {

      temp = s.substring(0, i + 1);
      StringBuilder tempString = new StringBuilder();
      while (tempString.length() < length) {
        tempString.append(temp);
      }
      if (tempString.toString().equals(s)) {
        return length/(i+1);
      } else {

        i++;
      }
    }
    System.out.println("siuuuuuuuuu!");
    return 1;

  }


}
