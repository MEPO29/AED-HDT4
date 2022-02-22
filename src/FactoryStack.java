/**
 * 
 * @author Manuel Martínez
 * @author Mario Puente
 * @author Luis Montenegro
 *
 * FactoryStack<E>
 * Patrón de diseño Factory para Stack<E>
 */

public class FactoryStack<E> {

	/**
	 * Genera una Stack
	 * @param tipo de Stack
	 * @return Stack nuevo
	 */
	public Stack<E> getStack(String tipo) {
		if (tipo.equals("ArrayList")) {
			return new StackArrayList<E>();
		}
		if (tipo.equals("Vector")) {
			return new StackVector<E>();
		}
		if (tipo.equals("LinkedList")) {
			return new StackList<E>("LinkedList");
		}
		if (tipo.equals("DoubleLList")) {
			return new StackList<E>("DoubleLList");
		}
		return new StackArrayList<E>();
		
	}
}
