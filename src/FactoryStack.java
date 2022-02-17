
public class FactoryStack<E> {

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
