/**
 * 
 * @author Manuel Martínez
 * @author Mario Puente
 * @author Luis Montenegro
 *
 * FactoryList<E>
 * Patrón de diseño Factory para el ADT List<E>
 */

public class FactoryList<E> {

	/**
	 * Genera una List<E>
	 * @param tipo de lista
	 * @return lista nueva
	 */
	public List<E> getList(String tipo){
		if (tipo.equals("LinkedList")) {
			return new LinkedList<E>();
		}
		return new DoubleLList<E>();
	}
}
