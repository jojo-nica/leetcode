import java.util.*;

/**
 * @author nica
 * @version 1.0
 */
public class Word {
  public static void main(String[] args) {
    Word word = new Word();
    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();
    String wordDictInput = scanner.nextLine();
    List<String> wordDict = new ArrayList<>(Arrays.asList(wordDictInput.split(" ")));
    Boolean result = word.wordBreak(s,wordDict);
    System.out.println(result);

  }
  public boolean wordBreak(String s, List<String> wordDict) {
        int len = s.length();
        boolean[] dp = new boolean[len+1];
        int maxlen=0;
      HashSet<String> set = new HashSet<>();
    for(String str:wordDict)
        {
          set.add(str);
          maxlen = Math.max(str.length(),maxlen);
        }
        dp[0] = true;
        for(int i=1;i<len+1;i++)
        {
          for(int j=i; j>=0 && j>=i-maxlen; j--)
          {
            if(dp[j] && set.contains(s.substring(j,i)))
            {
              dp[i]=true;
              break;
            }
          }
        }
        return dp[len];

  }
}
