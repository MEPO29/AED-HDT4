
public class StackList<E> extends AbstractStack<E>{

	List<E> data;
	
	StackList(String tipo){
		FactoryList<E> fact = new FactoryList<E>();
		data = fact.getList(tipo);
	}
	
	StackList(){
		this("DoubleLList");
	}
	
	@Override
	public void add(E item) {
		// TODO Auto-generated method stub
		data.add(item);
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		return data.removeLast();
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return data.peek();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return data.size();
	}
}