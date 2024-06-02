import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testIntList_oop {

	@Test
	void testIntList() {
		
		int[] sequence= {1,2,3,4,5};
		IntList myintlist=new IntList(sequence);
		
		assertArrayEquals(new int[] {1,2,3,4,5},myintlist.getSequence());
		assertEquals(5,myintlist.getLength());
		
		myintlist.addValue(10);
		assertArrayEquals(new int[] {1,2,3,4,5,10},myintlist.getSequence());
		assertEquals(6,myintlist.getLength());
		
		
		myintlist.removeValue();
		assertArrayEquals(new int[] {1,2,3,4,5},myintlist.getSequence());
		assertEquals(5,myintlist.getLength());
		
	}

}
