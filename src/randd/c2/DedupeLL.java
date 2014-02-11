package randd.c2;

import java.io.IOException;

import common.LinkedList;

public class DedupeLL {

  
  public static LinkedList deDupeLL(LinkedList l) throws IOException {
    
    for (int i=0; i< l.size; i++) {
    	 
    	for (int j=0; j < i; j++) {
    	  if ( l.getByIndex(j).equals(l.getByIndex(i))  ) {
    		  l.delete(j);
    		  break;
    	  }
    	}
    }
    
    return l;
    
  }
  
  public static void main(String[] args) {
    
  }
  
}
