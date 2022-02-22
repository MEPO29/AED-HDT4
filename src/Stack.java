/**
 * 
 * @author Manuel Martínez
 * @author Mario Puente
 * @author Luis Montenegro
 *
 * Stack<E>
 * 
 * Interfaz para Stack
 */

public interface Stack<E> {
	
	/**
	 * Añade elemento al final
	 * @param item
	 */
	public void add(E item);
	
	/**
	 * Obtiene y elimina último elemento añadido
	 * @return último elemnto
	 */
	public E pop();
	
	/**
	 * Obtiene último elemento añadido
	 * @return último elemento
	 */
	public E peek();
	
	/**
	 * Se está vacio
	 * @return true - vacio / false - con elementos
	 */
	public boolean empty();
	
	/**
	 * Cantidad de elementos
	 * @return cantidad de elementos
	 */
	public int size();
}
