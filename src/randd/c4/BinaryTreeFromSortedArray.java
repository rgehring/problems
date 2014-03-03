package randd.c4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import common.BinaryTree;

public class BinaryTreeFromSortedArray {

	
	public static void binaryTraversalofArray(List array, List out) {
		if (array == null) {
			return;
		}
		if ( array.size() == 0) {
			return;
		}
		if (array.size() == 1 ) {
			out.add(array.get(0));
			return ;
		}
		if (array.size() == 2 ) {
			out.add(array.get(0));
			out.add(array.get(1));
			return ;
		}
		if (array.size() == 3 ) {
			out.add(array.get(1));
			out.add(array.get(0));
			out.add(array.get(2));
			return ;
		}
		int center = array.size() / 2 ;
		System.out.println("left " + array.subList(0, center    ).toString() );

		System.out.println("right " + array.subList(center + 1, array.size()  ).toString() );
		
		binaryTraversalofArray(   array.subList(0, center   ) , out)  ;
		
		binaryTraversalofArray(  array.subList(center + 1, array.size()  ) , out)  ;
		out.add(array.get(center));
	}
	
	public static void makeFromArray(ArrayList array ) {
		BinaryTree b = new BinaryTree();
		ArrayList out = new ArrayList();
		
		binaryTraversalofArray(array, out);
		System.out.println(out);

	}
	
	public static void main(String[] args) {
		// sort the tree as you go and make one pass through the array, 
		// VS do binary lookups on the array indices.
		// well array lookups is constant time
		// and the insert would be constant time
		// so its actually best to do 'binary search traversal' on the array
		
		Integer[] indata = { 1,2,3,4,5,6,7,8 } ;
		ArrayList ready = new ArrayList( Arrays.asList(indata));
		System.out.println(ready.size());
		makeFromArray(ready);
		
	}
	
}
