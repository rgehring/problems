package randd.c1;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class CheckStringAllUniqueChars {

  private static String checkInput(String s) throws IOException {
    if ((s != null) ) {
      return s;
    }
    else {
      throw new IOException() ;
      }
  }
  
  public static boolean uniqueChars(String s) {
    Set<Character> seenChars = new HashSet<Character>();
    
    for (int i =0; i < s.length(); i++) {
      if (seenChars.contains( s.charAt(i) )) {
        return false;
      } else {
        seenChars.add(s.charAt(i) );
      }
    }
    return true;
  }
  
  public static void main(String[] args) throws IOException {
    String s = checkInput(args[0] );
    System.out.println( uniqueChars(s) );
    
  }
  
}
