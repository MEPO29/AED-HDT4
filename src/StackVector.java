/**
 * 
 * @author Manuel Martínez
 * @author Mario Puente
 * @author Luis Montenegro
 *
 * StackVector<E>
 * 
 * Implementación de Stack<E> con Vector
 */

import java.util.Vector;

public class StackVector<E> extends AbstractStack<E> {

	Vector<E> data;
	
	StackVector(){
		// post: arreglo vacio
		data = new Vector<E>();
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
		if (!empty()) {
			return data.remove(size() - 1);
		}
		return null;
	}

	/**
	 * Obtiene último elemnto
	 */
	@Override
	public E peek() {
		// pre: no está vacio
		// post: obtiene el último elemento
		if (!empty()) {
			return data.elementAt(size() - 1);
		}
		return null;
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
