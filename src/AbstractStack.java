/**
 * 
 * @author Manuel Martínez
 * @author Mario Puente
 * @author Luis Montenegro
 *
 * AbstractStack<E>
 * Clase abstracta para la implementación de Stack<E>
 */

public abstract class AbstractStack<E> implements Stack<E>{

	/**
	 * Indica si el Stack está vacio
	 */
	public boolean empty() {
		// post: true - vacio / false - con elementos
		return size() == 0;
	}
	
}
