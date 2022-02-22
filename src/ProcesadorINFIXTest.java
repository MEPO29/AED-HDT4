/**
 * 
 * @author Manuel Martínez
 * @author Mario Puente
 * @author Luis Montenegro
 *
 * ProcesadorINFIXTest
 * Pruebas Unitarias ProcesadorINFIX
 * Se realiza una prueba con cada Stack
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProcesadorINFIXTest {

	private void test(String tipo) {
		String postfix = ProcesadorINFIX.procesar("(1+2)*9", tipo);
		assertEquals(postfix, "1 2 + 9 * ");
		Calculadora calc = null;
		try {
			calc = new Calculadora();
		} catch (SingletonException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(27.0, calc.calculate(postfix), 0.001);
		
		postfix = ProcesadorINFIX.procesar("1+2*9");
		assertEquals(postfix, "1 2 9 * + ");
		assertEquals(19.0, calc.calculate(postfix), 0.001);
		calc.finalize();
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
