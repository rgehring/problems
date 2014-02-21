package randd.c3;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Stack;

public class TowerOfHanoi {
	

	Stack<Integer> s = new Stack<Integer>();
	Stack<Integer> m = new Stack<Integer>();
	Stack<Integer> r = new Stack<Integer>();


	private void printState() {
		System.out.println(Arrays.toString(s.toArray()) + "---" + Arrays.toString(m.toArray()) + "----" + Arrays.toString(r.toArray()) );
	}
	
	private static Boolean tryPlace(Integer i, Stack<Integer> s) {
		
		try {
			Integer a = s.peek();
			if (i < a) {
				s.add(i);
				return true;
			} else {
				return false;
			}
		} catch (EmptyStackException e) {
			s.add(i);
			return true;
		}
	
	}
	
	
	private void move(Stack<Integer> source, Stack<Integer> dest) {
		Integer piece = source.pop() ;
		if (!tryPlace( piece, dest)) {
			System.out.println("tried to move "+ piece.toString() + " and failed" ) ;
			source.add(piece);
			return;
		} 
		printState();
	}
		
	private void moveNFromTo(Integer n, Stack<Integer> source, Stack<Integer> other, Stack<Integer> dest) {
		if (n == 0) {
			return;
		}
			//move n-1 to other
			moveNFromTo(n-1, source, dest, other);
			// move source to dest
			move(source, dest);
			moveNFromTo(n-1,other, source, dest);
	}
	
	private void solve(int i) {
		moveNFromTo(i, s, m, r);
	}
	

    private void initStack(Integer i) {
		for (Integer j=i; j > 0; j--) {
			s.add(j);
		}
    	
    }
	
	public static void main(String[] args) {
		TowerOfHanoi tw = new TowerOfHanoi();
		tw.initStack(5);
		tw.printState();
		tw.solve(5);
	}

}
