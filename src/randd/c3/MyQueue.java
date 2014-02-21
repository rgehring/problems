package randd.c3;

import java.util.EmptyStackException;
import java.util.Stack;

public class MyQueue {

	Stack left = new Stack();
	Stack right = new Stack();
	
	public void add(Object o) {
		left.add(o);
	}
	
	public Object pop() {
		while (true) {
			try {
				Object j = left.pop();
				right.add(j) ;
			} catch (EmptyStackException e) {
				break;
			}
		}
		Object out = right.pop();
		while (true) {
			try {
				Object j = right.pop();
				left.add(j) ;
			} catch (EmptyStackException e) {
				break;
			}
		}
		return out ;
	}
	
	public static void main(String[] args) {
		MyQueue q = new MyQueue() ;
		q.add(1);
		q.add(2);
		q.add(3);
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
				
	}
	
}
