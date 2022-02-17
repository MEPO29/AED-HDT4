
public class DoubleLList<E> extends AbstractList<E> {
	
	DNode<E> head;
	DNode<E> tail;
	
	public DoubleLList(){
		head = new DNode<E>(null);
		tail = new DNode<E>(null, head);
		head.next = tail;
	}

	@Override
	public void add(E item) {
		// TODO Auto-generated method stub
		if (item == null) {
			throw new NullPointerException();
		}
		DNode<E> last = tail.prev;
		DNode<E> temp = new DNode<E>(item, last, tail);
		tail.prev = temp;
		last.next = temp;
		this.size++;
		
	}

	@Override
	public E remove(int i) {
		// TODO Auto-generated method stub
		
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

	@Override
	public E get(int i) {
		// TODO Auto-generated method stub
		if (i >= size() || i <0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		DNode<E> current = head;
		for (int j=0; j<i; j++) {
			current = current.next;
		}
		return current.next.data;
	}
	
	@Override
	public E removeLast() {
		if (size() == 0) {
			throw new NullPointerException();
		}
		DNode<E> last = tail.prev;
		last.prev.next = tail;
		tail.prev = last.prev;
		this.size--;
		return last.data;
		
	}
	
	@Override 
	public E peek() {
		if (size() == 0) {
			throw new NullPointerException();
		}
		return tail.prev.data;
	}



}

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
