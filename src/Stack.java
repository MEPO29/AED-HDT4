public interface Stack<E> {
	
	public void add(E item);
	
	public E pop();
	
	public E peek();
	
	public boolean empty();
	
	public int size();
}
