package randd.c2;

import java.io.IOException;

import common.LinkedList;

public class NthToLastOfLL {

	public static Object getNToLast(LinkedList l, int n) throws IOException {
	//iterate ll to get size, or just call size
	int size = l.size;
	return l.getByIndex(size - n -1 );
	
	}
}
