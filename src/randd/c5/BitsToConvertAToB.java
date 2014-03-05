package randd.c5;

public class BitsToConvertAToB {

	
	public static int bitsConvertAToB(int a , int b) {
		int count = 0;
		int temp;
		temp = (a & b) | (~a & ~b) ;
		for (int i = 0; i < 32 ; i++ ) {
			if ((temp & (1 << i)) != 0) {
				count+=1 ;
			}
		}
		
		return 32-count ;
	}
	
	public static void main(String[] args) {
		int a = 14;
		int b = 31 ;
		System.out.println( bitsConvertAToB(a,b)  );
	}
	
}
