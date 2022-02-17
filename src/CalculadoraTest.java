
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	
	private void test(String tipo) {
		Calculadora calc = null;
		try {
			calc = new Calculadora(tipo);
		} catch (SingletonException e) {
			
		}
		
		ArrayList<String> data = null;
		try {
			data = Archivos.leer("/Users/manuelmartinezflores/Documents/GitHub/AED-HDT4/src/datos.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String postfix = ProcesadorINFIX.procesar(data.get(0), tipo);
		assertEquals(27.0, calc.calculate(postfix), 0.01);
		
		postfix = ProcesadorINFIX.procesar(data.get(1), tipo);
		assertEquals(19.0, calc.calculate(postfix), 0.01);
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
