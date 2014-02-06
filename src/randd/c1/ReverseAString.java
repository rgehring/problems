package randd.c1;

public class ReverseAString {

  public static void main(String[] args) {
    String s = "abcd" ;
    StringBuffer out = new StringBuffer();
    for (int i=0; i<s.length(); i++) {
      out.append(s.charAt(s.length() - i -1 ) );
    }
    System.out.println(out);
  }
  
}
