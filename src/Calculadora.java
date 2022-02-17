
public class Calculadora {

	private Stack<Double> stack;
	private FactoryStack<Double> fact = new FactoryStack<Double>();
	private String tipo;
	private static boolean flagSingleton = false;
	

	Calculadora(String tipo_) throws SingletonException {
		if (flagSingleton) {
			throw new SingletonException("Solo se permite una calculadora");
		}
		stack = fact.getStack(tipo_);
		tipo = tipo_;
		flagSingleton = true;
	}
	
	Calculadora() throws SingletonException {
		this("ArrayList");
		flagSingleton = true;
	}
	/**
	 * Evalua la operación tipo POSTFIX
	 */
	public double calculate(String operation) {
		try {
			stack = fact.getStack(tipo);
			String[] data = operation.split(" ");
			for (String s : data) {
				if (s.equals("+")) {
					suma();
				} else if (s.equals("-")) {
					resta();
				} else if (s.equals("*")) {
					multiplicacion();
				} else if (s.equals("/")) {
					division();
				} else {
					try {
						stack.add(Double.valueOf(s));
					} catch (Exception e) {
						throw new Exception("Caracter invalido");
					}
				}
			}
			
			
			if (stack.size() > 1) {
				throw new Exception("Demasiados operandos");
			}
			return stack.pop();
		} catch (Exception e) {
			return 0;
		}
	}
	
	/**
	 * Suma los dos ultimos elementos del stack
	 * @throws Exception si no hay suficientes operandos
	 */
	private void suma() throws Exception {
		if (stack.size() < 2) {
			throw new Exception("No hay suficientes operandos");
		}
		Double opB = stack.pop();
		Double opA = stack.pop();
		stack.add(opA + opB);
	}
	
	/**
	 * Resta los dos ultimos elementos del stack
	 * @throws Exception si no hay suficientes operandos
	 */
	private void resta() throws Exception {
		if (stack.size() < 2) {
			throw new Exception("No hay suficientes operandos");
		}
		Double opB = stack.pop();
		Double opA = stack.pop();
		stack.add(opA - opB);
	}
	
	/**
	 * Multiplica los dos ultimos elementos del stack
	 * @throws Exception si no hay suficientes operandos
	 */
	private void multiplicacion() throws Exception {
		if (stack.size() < 2) {
			throw new Exception("No hay suficientes operandos");
		}
		Double opB = stack.pop();
		Double opA = stack.pop();
		stack.add(opA * opB);
	}
	
	/**
	 * Divide los dos ultimos elementos del stack
	 * @throws Exception si no hay suficientes operandos o hay division entre 0
	 */
	private void division() throws Exception {
		if (stack.size() < 2) {
			throw new Exception("No hay suficientes operandos");
		}
		Double opB = stack.pop();
		Double opA = stack.pop();
		if (opB == 0) {
			throw new Exception("División entre 0");
		}
		stack.add(opA / opB);
	}
	
	public void finalize() {
		flagSingleton = false;
	}
	
}
