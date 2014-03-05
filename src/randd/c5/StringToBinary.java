package randd.c5;

public class StringToBinary {

	
	public static void printBinary(String s) {
		
		Integer data = Integer.parseInt(s);
		
		
		for(int i=32; i>=0; i--) {
			if  (( data & ( 1 << i ) ) != 0 ) {
				System.out.print(1);
			} else {
				System.out.print(0);
			}
		}

	}
	
	public static void main(String[] args) {
		String s = "2";
		printBinary(s);
		
	}
	
}
