
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
    int position = 0;
    if (size <= index) {
      throw new IOException();
    }
    Link nextNode = first;
    Link lastNode ;

    for (; position < index ; position++) {
      lastNode = nextNode;
      
      nextNode = nextNode.getNext();
      
      if (position==index) {
        lastNode.setNext( nextNode.getNext() );
        nextNode = null ;
      }
      
    }
    
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
