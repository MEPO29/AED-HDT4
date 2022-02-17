
public class LinkedList<E> extends AbstractList<E> {

	Node<E> head = new Node<E>(null);
	
	@Override
	public void add(E item) {
		// TODO Auto-generated method stub
		if (item == null) {
			throw new NullPointerException();
		}
		Node<E> current = head;
		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(new Node<E>(item));
		this.size++;
	}

	@Override
	public E remove(int i) {
		// TODO Auto-generated method stub
		Node<E> current = head;
		if (i >= size() || i <0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		for (int j=0; j<i; j++) {
			current = current.getNext();
		}
		Node<E> temp = current.getNext();
		current.setNext(temp.getNext());
		size--;
		return temp.getData();
	}

	@Override
	public E get(int i) {
		// TODO Auto-generated method stub
		if (i >= size() || i <0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		Node<E> current = head;
		for (int j=0; j<i; j++) {
			current = current.getNext();
		}
		return current.getNext().getData();
	}

	@Override
	public E removeLast() {
		// TODO Auto-generated method stub
		return remove(size()-1);
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return get(size()-1);
	}


}

class Node<E> {
	
	Node<E> next;
	E data;
	
	Node(E item){
		data = item;
	}
	
	Node(E item, Node<E> next_) {
		this(item);
		next = next_;
	}
	
	public Node<E> getNext() {
		return next;
	}
	
	public E getData() {
		return data;
	}
	
	public void setNext(Node<E> next_) {
		next = next_;
	}
}
