package randd.c3;

import java.util.ArrayList;
import java.util.Stack;

public class SetOfStacks {
	//it's an arraylist with elements stack with a size counter.
    // just push onto the last one unless last one has size > k
	//also add a pop at method to pop from any of the stacks.
	// 
	
	ArrayList<Stack> stacks = new ArrayList<Stack>();
	
	public SetOfStacks() {
		
	}
	
	public void push(Integer i) {
		if (stacks.size() == 0)  {
			stacks.add(new Stack());
		}
		Stack curr;
		curr = stacks.get(stacks.size()-1 );
		if (curr.size() > 1) {
			stacks.add(new Stack());
			push(i);
		} else {
			curr.push(i);
		}
		
	}
	
	private void rebalance(Integer i) {
		//not implemented;
	}
	
	public Integer pop(Integer i) {
		Stack curr;
		curr = stacks.get(i );
		Integer out = (Integer) curr.pop();
		rebalance(i);
		return out;
	}
	
	public static void main(String[] args) {
		SetOfStacks a = new SetOfStacks();
		a.push(1);
	}
}
