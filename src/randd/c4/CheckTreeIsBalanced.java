package randd.c4;
import common.BinaryTree;

public class CheckTreeIsBalanced {
	

	
	public static Integer maxDepth(BinaryTree bt) {
		Integer candidateL;
		Integer candidateR;
		
		if (bt.left != null) {
			candidateL = 1+ maxDepth( bt.left ) ;
		} else { 
			candidateL =0;
		}
		if (bt.right != null) {
			candidateR = 1+maxDepth( bt.right ) ;
		} else { 
			candidateR =0;
		}
		
		if ( candidateL > candidateR) {
			return candidateL ;
		} else {
			return candidateR ;
		}
	}
	
	public static Integer minDepth(BinaryTree bt) {
		Integer candidateL;
		Integer candidateR;
		
		if (bt.left != null) {
			candidateL = 1+minDepth( bt.left ) ;
		} else { 
			candidateL =0;
		}
		if (bt.right != null) {
			candidateR = 1+minDepth( bt.right ) ;
		} else { 
			candidateR =0;
		}
		
		if ( candidateL < candidateR) {
			return candidateL ;
		} else {
			return candidateR ;
		}
	}
	
	public static boolean check(BinaryTree bt ) {
		//visit all kids and get the min and max height
		
		if (maxDepth(bt) - minDepth(bt) > 1) {
			return false;
		} else {
			return true;
		}
	}
	
	
	public static void main(String[] args) {
		BinaryTree inData = new BinaryTree();
		inData.left = new BinaryTree();
		inData.right = new BinaryTree();
		inData.left.left = new BinaryTree();
		System.out.println(check(inData));
		
		BinaryTree failData = new BinaryTree();
		failData.left = new BinaryTree();
		failData.left.left = new BinaryTree();
		System.out.println(check(failData));
		
		
	}
	
	
}
