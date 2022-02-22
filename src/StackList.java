/**
 * 
 * @author Manuel Martínez
 * @author Mario Puente
 * @author Luis Montenegro
 *
 * StackList<E>
 * 
 * Implementación de Stack<E> con List
 * Utiliza Factory para generar List
 */

public class StackList<E> extends AbstractStack<E>{

	List<E> data;
	
	/**
	 * Constructor
	 * @param tipo de List
	 */
	StackList(String tipo){
		// post: stack vacio
		FactoryList<E> fact = new FactoryList<E>();
		data = fact.getList(tipo);
	}
	
	StackList(){
		this("DoubleLList");
	}
	
	/**
	 * Añade un elemento al final
	 */
	@Override
	public void add(E item) {
		// post: añade elemento al final
		data.add(item);
	}

	/**
	 * Obtiene y elimina último elemento
	 */
	@Override
	public E pop() {
		// pre: no está vacio
		// post: obtiene y elimina el último elemnto
		return data.removeLast();
	}

	/**
	 * Obtiene último elemnto
	 */
	@Override
	public E peek() {
		// pre: no está vacio
		// post: obtiene el último elemento
		return data.peek();
	}

	/**
	 * Indica cantidad de elementos
	 */
	@Override
	public int size() {
		// post: cantidad de elementos.
		return data.size();
	}
}