
public class FactoryList<E> {

	public List<E> getList(String tipo){
		if (tipo.equals("LinkedList")) {
			return new LinkedList<E>();
		}
		return new DoubleLList<E>();
	}
}
