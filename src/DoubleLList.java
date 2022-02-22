/**
 * 
 * @author Manuel Martínez
 * @author Mario Puente
 * @author Luis Montenegro
 *
 * DoubleLList<E>
 * Implementación de lista doblemente encadenada para List<E>
 */

public class DoubleLList<E> extends AbstractList<E> {
	
	DNode<E> head;
	DNode<E> tail;
	
	/**
	 * Inicializa cola y cabeza
	 */
	public DoubleLList(){
		// post: arreglo vacio
		head = new DNode<E>(null);
		tail = new DNode<E>(null, head);
		head.next = tail;
	}

	/**
	 * Añade un elemento al final de la lista
	 */
	@Override
	public void add(E item) {
		// post: añade elemento al final del arreglo
		if (item == null) {
			throw new NullPointerException();
		}
		DNode<E> last = tail.prev;
		DNode<E> temp = new DNode<E>(item, last, tail);
		tail.prev = temp;
		last.next = temp;
		this.size++;
		
	}

	/**
	 * Elemina el i-esimo elemento del arreglo
	 */
	@Override
	public E remove(int i) {
		// pre: el índice no se encuentra fuera del rango válido
		// post: elimina el nodo del arreglo
		
		if (i >= size() || i <0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		if (i == size() - 1) {
			return removeLast();
		}
		
		DNode<E> current = head;
		for (int j=0; j<i; j++) {
			current = current.next;
		}
		DNode<E> temp = current.next;
		E data = temp.data;
		current.next = temp.next;
		temp.next.prev = current;
		this.size--;
		return data;
	}

	/**
	 * Obtiene el i-esimo elemento del arreglo
	 */
	@Override
	public E get(int i) {
		// pre: el índice no se encuentra fuera del rango válido
		// post: el índice no se encuentra
		if (i >= size() || i <0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		DNode<E> current = head;
		for (int j=0; j<i; j++) {
			current = current.next;
		}
		return current.next.data;
	}
	
	/**
	 * Elimina el último elemento de la list
	 */
	@Override
	public E removeLast() {
		// pre: no está vacia
		// post: elimina el último nodo de la lista
		if (size() == 0) {
			throw new NullPointerException();
		}
		DNode<E> last = tail.prev;
		last.prev.next = tail;
		tail.prev = last.prev;
		this.size--;
		return last.data;
		
	}
	
	/**
	 * Obtienen el último elemento de la lista
	 */
	@Override 
	public E peek() {
		// pre: no está vacia
		// post: obtiene el último elemento de la lista
		if (size() == 0) {
			throw new NullPointerException();
		}
		return tail.prev.data;
	}



}

/**
 * 
 * DNode<E>
 * Nodo doblemente encadenado 
 */
class DNode<E> {
	
	DNode<E> prev;
	DNode<E> next;
	E data;
	
	DNode(E item) {
		data = item;
	}
	
	DNode(E item, DNode<E> prev_){
		this(item);
		prev = prev_;
	}
	
	DNode(E item, DNode<E> prev_, DNode<E> next_){
		this(item, prev_);
		next = next_;
	}
	
}
