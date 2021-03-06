/**
 * 
 * @author Manuel Martínez
 * @author Mario Puente
 * @author Luis Montenegro
 *
 * LinkedListTest
 * Pruebas Unitarias LinkedList
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListTest {

	@Test
	void testAdd() {
		List<Integer> list = new LinkedList<Integer>();
		try {
			list.add(1);
			list.add(2);
			list.add(3);
			assertEquals(2, list.get(1));
			assertEquals(1, list.get(0));
			assertEquals(3, list.size());
		} catch (Exception e) {
			fail("Error");
		}
		
		try {
			list.add(null);
			fail("Error");
		} catch (Exception e) {
			
		}

		
		
	}

	@Test
	void testRemove() {
		List<Integer> list = new LinkedList<Integer>();
		try {
			list.add(1);
			list.add(2);
			list.add(3);
			assertEquals(2, list.remove(1));
			assertEquals(2, list.size());
			assertEquals(3, list.get(1));
			assertEquals(1, list.remove(0));
			assertEquals(3, list.remove(0));
		} catch (Exception e) {
			fail("Error");
		}
		
		try {
			list.remove(10);
			fail("Error");
		} catch (Exception e) {
			
		}
	}

	@Test
	void testGet() {
		List<Integer> list = new LinkedList<Integer>();
		try {
			list.add(1);
			list.add(2);
			assertEquals(2, list.get(1));
			assertEquals(1, list.get(0));
		} catch (Exception e) {
			fail("Error");
		}
		
		try {
			list.get(100);
			fail("Error");
		} catch (Exception e) {
			
		}
	}

}
