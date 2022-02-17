import java.util.Scanner;

public class Vista {
	
	Scanner scan = new Scanner(System.in);
	
	public int menuCalc() {
		int respuesta = 0;
		while (respuesta <1 || respuesta >3) {
			System.out.println("\nQue implementación desea utilizar?\n1 - ArrayList\n2 - Vector\n3 - Lista\n");
			try {
				respuesta = scan.nextInt();
			} catch (Exception e) {
				scan.nextLine();
				respuesta = 0;
				System.out.println("\nIngrese una respuesta válida\n");
			}
			if (respuesta <1 || respuesta >3) {
				System.out.println("\nIngrese un número entre 1 y 3\n");
			}
		}
		
		return respuesta;
	}
	
	public int menuLista() {
		int respuesta = 0;
		while (respuesta <1 || respuesta >2) {
			System.out.println("\nQue implementación desea utilizar?\n1 - LinkedList\n2 - DoubleLinkedList\n");
			try {
				respuesta = scan.nextInt();
			} catch (Exception e) {
				scan.nextLine();
				respuesta = 0;
				System.out.println("\nIngrese una respuesta válida\n");
			}
			if (respuesta <1 || respuesta >2) {
				System.out.println("\nIngrese un número entre 1 y 2\n");
			}
		}
		
		return respuesta;
	}
	
	public String getPath() {
		System.out.println("Ingrese la ubicación del archivo .txt");
		return scan.nextLine();
	}
	
	public void mostrarException() {
		System.out.println("Error en el archivo");
	}
	
	public void singleton() {
		System.out.println("Solo se permite una calculadora");
	}
	
	public void mostrarResultado(String infix, String postfix, Double resultado) {
		System.out.println(infix + " = " + postfix + "= " + resultado.toString());
	}

}
