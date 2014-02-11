import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import common.LinkedList;

public class LinkedListTest {

	private common.LinkedList l ;
	
	@Before
	public void setup() {
		l = new LinkedList();
	}
	
	
	@Test
	public void deleteUnitTest() throws IOException {
		l.addFirst("c");
		l.addFirst("b");
		l.addFirst("a");
		l.delete(1);
		assertEquals("a", l.getByIndex(0) );
		assertEquals("c", l.getByIndex(1) );
		l.delete(0);
		assertEquals("c", l.getByIndex(0) );
		
	}
	
	@Test
	public void addFirstUnitTest() throws IOException {
		l.addFirst("a");
		assertEquals("a", l.getByIndex(0) );
		l.addFirst("b");
		assertEquals("b", l.getByIndex(0) );
	}
	@Test
	public void findUnitTest() {
		l.addFirst("c");
		l.addFirst("b");
		l.addFirst("a");
		assertEquals(Integer.valueOf(0) , l.indexOf("a") );
		assertEquals(Integer.valueOf(1), l.indexOf("b") );
		assertEquals(Integer.valueOf(2), l.indexOf("c") );
	}
	@Test
	public void getByIndexTest() throws IOException {
		l.addFirst("c");
		l.addFirst("b");
		l.addFirst("a");
		assertEquals("a" , l.getByIndex(0) );
		assertEquals("b" , l.getByIndex(1) );
		assertEquals("c" , l.getByIndex(2) );
	}
	
	@Test(expected=IOException.class)
	public void getByIndexExceptionTest() throws IOException {
		l.addFirst("c");
		l.addFirst("b");
		l.addFirst("a");
		l.getByIndex(3) ;

	}
	
	
	
	

}
