/**
 * 
 * @author Manuel Martínez
 * @author Mario Puente
 * @author Luis Montenegro
 *
 * AbstracList<E>
 * Clase abstracta para la implementación de List<E>
 */


public abstract class AbstractList<E> implements List<E> {

	protected int size = 0;
	
	/**
	 * Indica el tamaño del arreglo
	 */
	public int size() {
		// post: indica cantidad de elementos
		return size;
	}

}
