/**
 * 
 * @author Manuel Martínez
 * @author Mario Puente
 * @author Luis Montenegro
 *
 * List<E>
 * Interfaz de lista
 */
public interface List<E> {

	/**
	 * Indica cantidad de elementos
	 * @return size
	 */
	public int size();
	
	/**
	 * Añade elemento al final
	 * @param item
	 */
	public void add(E item);
	
	/**
	 * Elimina i-esimo elemento
	 * @param i
	 * @return i-esimo elemento
	 */
	public E remove(int i);
	
	/**
	 * obtiene i-esimo elemento
	 * @param i
	 * @return i-esimo elemento
	 */
	public E get(int i);
	
	/**
	 * Elimina último elemento
	 * @return último elemento
	 */
	public E removeLast();
	
	/**
	 * Obtienen último elemento
	 * @return úlitmo elemento
	 */
	public E peek();
	
}
