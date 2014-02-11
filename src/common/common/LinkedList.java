package common;

import java.io.IOException;

public class LinkedList {

  private Link first = null;
  public int size =0;

  public void addFirst(Object data) {
    Link newFirst = new Link(data, first);
    first = newFirst;
    size++;
  }
  
  public void delete(int index) throws IOException {
    
    if (size <= index) {
      throw new IOException();
    }
    Link nextNode = first;
    Link lastNode = null;

    for (int position = 0; position <= index ; position++) {
      if (position==index) {
          size--;
          if (lastNode != null) {
            lastNode.setNext( nextNode.getNext() );
          } else {
        	  first = nextNode.getNext();
          }
          nextNode = null ;
      }    else {
    	
        lastNode = nextNode;
        nextNode = nextNode.getNext();
      }
      
    }
    
  }
  public Object getByIndex(int i) throws IOException {
	   int position = 0;
	   if (i >= size) {
		   throw new IOException("out of bounds");
	   }
	   Link node = first;
	    for (position=0 ; position < i ; position++) {
	      node = node.getNext();
	    }
	    return node.getData();
  }
  
  public Integer indexOf(Object data)  {
    
    int position = 0;
    Link node = first;
    for (;;position++) {
      if (node.getData().equals(data) ) {
        return position;
      }
      node = node.getNext();
      if (node == null) {
        return null ;    
      }
    }
  }
  
  private class Link {
    private Object data ;
    private Link next ;
  
    public Link(Object data, Link next) {
      setData(data);
      setNext(next);
    }
    
    public Object getData() {
      return data;
    }
    
    public Link getNext() {
      return next;
    }
    
    public void setData(Object data) {
      this.data = data;
    }
    
    public void setNext(Link next) {
      this.next = next;
    }
    
  }
  
  
}
