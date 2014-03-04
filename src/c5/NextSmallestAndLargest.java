package c5;

public class NextSmallestAndLargest {

	public static void printSmallest(Integer data) {
		
		//seek until leftmost 1 with a 0 preceding it
		// move the one left
		// error if there are no 1's with a preceding 0
		
		int out = data;
		boolean lastbit = true;
		
		
		for (int i=0; i<= 32; i++) {
			if  ( (( data & ( 1 << i ) )  != 0) && !lastbit   ) {
				//set preceding bit to one and current bit to 0
				out = out & ~(1 << i);
				out = out | (1 << i-1);
				System.out.println(out);
				System.out.println(Integer.toBinaryString(out));
				return ;
			} else {
				lastbit = (( data & ( 1 << i ) )  != 0);
			}
		}
	}

	public static void printLargest(Integer data) {

		//seek until leftmost 1 with a 0 succeding it
		// move the one right
		// error if there are no 1's with a succeding 0
		int out = data;
		boolean lastbit = true;
		
		
		for (int i=31; i>= 0; i--) {
			if  ( (( data & ( 1 << i ) )  != 0) && !lastbit   ) {
				//set preceding bit to one and current bit to 0
				out = out & ~(1 << i);
				out = out | (1 << i+1);
				System.out.println(out);
				System.out.println(Integer.toBinaryString(out));
				return ;
			} else {
				lastbit = (( data & ( 1 << i ) )  != 0);
			}
		}
		
		

	}

	
	public static void main(String[] args) {
		Integer input = 16;
		printSmallest( input );
		printLargest( input );
		
	}
	
	
}
