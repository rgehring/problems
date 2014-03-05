package randd.c5;

public class SetSomeBits {

	
	public static int setBetweenInToOut(int indata, int otherdata, int leftIndex, int rightIndex ) {
		int out = indata;
		
		//test each bit of otherdata and set to 1 or 0 appropriately
		for (int i = leftIndex; i <= rightIndex; i++)  {
			if ( (otherdata & (1 << i ))  !=  0) {
				out = out | (1 << i) ;
			} else {
				out = out & ~( 1 << i  );
			}
		}
		
		
		return out;
	}
	
	public static void main(String[] args) {
		
		Integer i = 2 ;
		Integer j = 256+64+32+16;
		System.out.println( Integer.toBinaryString(i)  ); 
		System.out.println( Integer.toBinaryString(j)  ); 
		int left = 1;
		int right = 7 ;
		int out = setBetweenInToOut(i, j, left, right);
		System.out.println(Integer.toBinaryString(out));
		
	}
	
}
