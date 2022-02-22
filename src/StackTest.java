/**
 * 
 * @author Manuel Martínez
 * @author Mario Puente
 * @author Luis Montenegro
 *
 * StackTest
 * Pruebas Unitarias Stack
 * Se realiza una prueba por implementación
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StackTest {

	void test(String tipo) {
		FactoryStack<Integer> fact = new FactoryStack<Integer>();
		Stack<Integer> stack = fact.getStack(tipo);
		
		for (int i=99; i>=0; i--) {
			stack.add(i);
			assertEquals(100-i, stack.size());
		}
		
		for (int i=0; i<100; i++) {
			assertEquals(i, stack.pop());
			assertEquals(99-i, stack.size());
		}
		
		assert(stack.empty());
	}
	
	@Test
	void testDoubleLList() {
		test("DoubleLList");
	}
	
	@Test
	void testLinkedList() {
		test("LinkedList");
	}
	
	@Test
	void testVector() {
		test("Vector");
	}
	
	@Test
	void testArrayList() {
		test("ArrayList");
	}

}
