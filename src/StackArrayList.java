import java.util.ArrayList;

public class StackArrayList<E> extends AbstractStack<E> {

	ArrayList<E> data = new ArrayList<E>();
	
	@Override
	public void add(E item) {
		// TODO Auto-generated method stub
		data.add(item);
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		if (!empty()) {
			return data.remove(size() - 1);
		}
		return null;
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		if (!empty()) {
			return data.get(size() - 1);
		}
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return data.size();
	}
}
