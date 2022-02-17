import java.util.ArrayList;

public class Controlador {
	
	public static void main(String[] args) {
				
		Vista vista = new Vista();
		ArrayList<String> data = null;
		Calculadora calc = null;
		String tipoImplementacion = "";
		
		boolean archivo = false;
		while(!archivo) {
			try {
				data = Archivos.leer(vista.getPath());
				archivo = true;
			} catch (Exception e) {
				vista.mostrarException();
			}
		}
		
		switch(vista.menuCalc()) {
		
			case 1:
				tipoImplementacion = "ArrayList";
				break;
				
			case 2:
				tipoImplementacion = "Vector";
				break;
				
			case 3:
				if (vista.menuLista() == 1) {
					tipoImplementacion = "LinkedList";
				} else {
					tipoImplementacion = "DoubleLinkedList";
				}
		}
		
		try {
			calc = new Calculadora(tipoImplementacion);
		} catch (SingletonException e) {
			vista.singleton();
		}
		
		for (String infix : data) {
			String postfix = ProcesadorINFIX.procesar(infix, tipoImplementacion);
			Double resultado = calc.calculate(postfix);
			vista.mostrarResultado(infix, postfix, resultado);
		}
	}

}
