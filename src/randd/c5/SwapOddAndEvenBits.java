package randd.c5;

public class SwapOddAndEvenBits {

	public static int swapOddAndEven(int data ) {
		int out = data;
		int eomask = 0;
		
		for (int i = 0; i <= 31; i++) {
			if ( (i % 2) == 0)  {
				eomask += Math.pow(2, i) ;				
			}	
		}
		out = ( ( out & eomask) << 1 ) |  ( (out & ( eomask << 1 ) ) >> 1 )    ;
		
		return out ;
	}
	
	public static void main(String[] args) {
		int data = 1 + 4 + 16+ 64 + 256;
		System.out.println(Integer.toBinaryString(data) );
		System.out.println(Integer.toBinaryString( swapOddAndEven(data)) );
	}
	
}
