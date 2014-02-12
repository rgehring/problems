package randd.c3;

public class PushPopMinStack {

	Node top = null;
	Node min = null;
	
	private class Node {
		Node next = null;
		Node nextMin = null ;
		Integer data ;
		public Node(Integer data) {
			this.data = data;
		}
		public Integer getData() {
			return data;
		}
	}
	
	public void push(Integer i) {
		Node in = new Node(i);
		in.next = top ;
		top = in;
		if  (min != null)  {
			if (i < min.data) {
			  in.nextMin = min;
			  min = top ;
			}
		} else {
			  min = top ;
		}
	}

	public Integer pop() {
		Integer out = top.getData();
		if (min.equals(top)) {
			min = top.nextMin;
		}
			
		top=top.next ;
		return out;
	}

	public Integer min() {
		return min.getData() ;
	}

	
	public static void main(String[] args) {
		PushPopMinStack a = new PushPopMinStack();
		a.push(3);
		System.out.println("min: "+ a.min() + " top: "+a.top.getData());

		a.push(7);
		System.out.println("min: "+ a.min() + " top: "+a.top.getData());

		a.push(1);
		System.out.println("min: "+ a.min() + " top: "+a.top.getData());
		a.pop();
		System.out.println("min: "+ a.min() + " top: "+a.top.getData());
		a.pop();
		System.out.println("min: "+ a.min() + " top: "+a.top.getData());
		a.pop();
		System.out.println("min: "+ a.min() + " top: "+a.top.getData());

	}
	
}
