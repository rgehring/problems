package randd;

public class RemoveDupesFromStrings {

  public static void main(String[] args) {
    char[] s = "aaaabbbbbbab".toCharArray();
    System.out.println(s);
    
    for (int i=0; i < s.length; i++ ) {
      for (int j =0; j < i; j++ ) {
        if (s[i]==s[j]) {
          s[i] = 0  ;         
        }
      }
           
    }
    System.out.println(s);
    
  }
  
}
