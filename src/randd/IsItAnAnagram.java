package randd;

public class IsItAnAnagram {

  
  
  public static boolean isAnagram(String s1, String s2) {
    
    char[] ca1 = s1.toCharArray();
    char[] ca2 = s2.toCharArray();
    int[] storage1= new int[256] ; 
    int[] storage2= new int[256] ; 

    for (int i=0; i <=255; i++) {
      storage1[i] = 0 ;
      storage2[i] = 0 ;
    }
    
    for(int i=0; i< ca1.length ; i++ ) {
       storage1[ ca1[i] ] += 1;
       storage2[ ca2[i] ] += 1;      
    }
    for (int i=0; i <=255; i++) {
     if ( storage1[i] !=  storage2[i] ) {
       return false;
     }
    }
    
    return true;
  }
  
  public static void main(String[] args) {
    String s1 = "batmans";
    String s2 = "manbats";
    System.out.println(isAnagram(s1, s2));
  }
  
}
