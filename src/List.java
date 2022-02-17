
public interface List<E> {

	public int size();
	
	public void add(E item);
	
	public E remove(int i);
	
	public E get(int i);
	
	public E removeLast();
	
	public E peek();
	
}
