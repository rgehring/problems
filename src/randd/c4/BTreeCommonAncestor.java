package randd.c4;

import java.util.Arrays;

import javax.sql.CommonDataSource;

import common.BinaryTree;

public class BTreeCommonAncestor {

		
	public static BinaryTree commonAncestor(BinaryTree r, BinaryTree a, BinaryTree b) {
		
		BinaryTree out = null;
		
		// start at the top, if a and b are in left then start at left
		if ( isChild(r, a ) && isChild(r, b) ) {
			out = r;
		}
		
		if ( isChild(r.left, a ) && isChild(r.left, b) ) {
			return commonAncestor(r.left, a, b);
		}

		if ( isChild(r.right, a ) && isChild(r.right, b) ) {
			return commonAncestor(r.right, a, b);
		}
		
		return out ;
	}
	
	private static boolean isChild(BinaryTree root, BinaryTree a) {
		boolean out  = false;

		if (root.left == null && root.right == null) {
			return out;
		}
		
		if ( a == root.left ) {
			out = true;
		} 
		if ( a == root.right ) {
			out = true;
		}
		
		if (! out ) {
			Boolean leftchild = isChild(a.left, a );
			Boolean rightchild = isChild(a.right, a);
			if (leftchild || rightchild) {
				out = true;
			}

		}
				
		return out;
		
	}

	public static void main(String[] args) {
		BinaryTree b1 = new BinaryTree();
		BinaryTree b2 = new BinaryTree();
		BinaryTree b3 = new BinaryTree();
		BinaryTree b4 = new BinaryTree();
		BinaryTree b5 = new BinaryTree();
		BinaryTree b6 = new BinaryTree();
		BinaryTree b7 = new BinaryTree();
		BinaryTree b8 = new BinaryTree();
		BinaryTree b9 = new BinaryTree();
		
		b1.left= b2;
		b1.right= b3;
		b2.left= b4;
		b2.right= b5;
		b3.left= b6;
		b3.right= b7;
		b4.left= b8;
		b4.right= b9;

		BinaryTree out = commonAncestor(b1, b5, b4);
		System.out.println("the ancestors are " + out.toString() );
		
	}
	
}
