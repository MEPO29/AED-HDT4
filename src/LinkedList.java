/**
 * 
 * @author Manuel Martínez
 * @author Mario Puente
 * @author Luis Montenegro
 *
 * LinkedList<E>
 * Implementación de lista encadenada para List<E>
 */

public class LinkedList<E> extends AbstractList<E> {

	Node<E> head;
	LinkedList(){
		// post: lista vacia
		 head = new Node<E>(null);
	}
	
	/**
	 * Añade un elemento al final de la lista
	 */
	@Override
	public void add(E item) {
		// pre: elemento no es null
		// post: añade el elemento al final de la lista
		if (item == null) {
			throw new NullPointerException();
		}
		Node<E> current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = new Node<E>(item);
		this.size++;
	}

	/**
	 * Elimina el i-esimo elemento del arreglo
	 */
	@Override
	public E remove(int i) {
		// pre: índice se encuetra dentro del rango
		// post: se elimina el i-esimo nodo
		Node<E> current = head;
		if (i >= size() || i <0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		for (int j=0; j<i; j++) {
			current = current.next;
		}
		Node<E> temp = current.next;
		current.next = temp.next;
		size--;
		return temp.data;
	}

	/**
	 * Obtiene el i-esimo elemento del arreglo
	 */
	@Override
	public E get(int i) {
		// pre: índice se encuentra dentro del rango
		// post: se obtiene el i-esimo nodo
		if (i >= size() || i <0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		Node<E> current = head;
		for (int j=0; j<i; j++) {
			current = current.next;
		}
		return current.next.data;
	}

	/**
	 * Elimina el último elemento de la lista
	 */
	@Override
	public E removeLast() {
		// pre: no está vacia
		// post: se elimina el último nodo
		return remove(size()-1);
	}

	/**
	 * Obtiene el úlitmo elemento de la lista
	 */
	@Override
	public E peek() {
		// pre: no está vacia
		// post: se elimina el último nodo
		return get(size()-1);
	}


}

/**
 * 
 *
 * Node<E>
 * Nodo simplemente encadenado
 */
class Node<E> {
	
	Node<E> next = null;
	E data;
	
	Node(E item){
		data = item;
	}
	
	Node(E item, Node<E> next_) {
		this(item);
		next = next_;
	}

}
