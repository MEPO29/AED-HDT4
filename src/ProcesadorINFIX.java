/**
 * 
 * @author Manuel Martínez
 * @author Mario Puente
 * @author Luis Montenegro
 *
 * ProcesadorINFIX
 * Traduce operaciones INFIX a POSTFIX.
 * Utiliza Factory para Stack
 */
public class ProcesadorINFIX {
	
	/**
	 * Procesa INFIX a POSTFIX
	 * @param operation
	 * @return POSTFIX
	 */
	public static String procesar(String operation) {
		return procesar(operation, "DoubleLList");
	}

	/**
	 * Procesa INFIX a POSTFIX
	 * @param operation
	 * @param tipo de Stack
	 * @return POSTFIX
	 */
	public static String procesar(String operation, String tipo) {
		String postfix = "";
		FactoryStack<Character> fact = new FactoryStack<Character>();
		Stack<Character> stack =  fact.getStack(tipo);
		stack.add('#');
		char[] data = operation.toCharArray();
		
		for (char c : data) {
			if (Character.isDigit(c)) {
				postfix += Character.toString(c) + " ";
			} else if (Character.toString(c).equals("(")) {
				stack.add(c);
			} else if (Character.toString(c).equals("^")) {
				stack.add(c);
			} else if (Character.toString(c).equals(")")) {
				while (!stack.empty() && !stack.peek().toString().equals("(")) {
					postfix += Character.toString(stack.pop()) + " ";
				}				
			} else {
				while (!stack.empty() && precedence(c) <= precedence(stack.peek())) {
					postfix += stack.pop() + " ";
				}
				stack.add(c);
			}
		}
		while (!stack.empty()) {
			if (Character.toString(stack.peek()).equals("(") || Character.toString(stack.peek()).equals(")") || Character.toString(stack.peek()).equals("#")) {
				stack.pop();
			} else {
				postfix += stack.pop() + " ";
			}
			
		}
		
		return postfix;
	}
	
	/**
	 * Indica precedencia de operadores
	 * @param c operador
	 * @return precedencia
	 */
	private static int precedence(char c) {

		if (Character.toString(c).equals("+") || Character.toString(c).equals("-")) {
			return 1;
		}
		if (Character.toString(c).equals("*") || Character.toString(c).equals("/")) {
			return 2;
		}
		return 0;
		
	}
}
