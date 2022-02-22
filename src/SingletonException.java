/**
 * 
 * @author Manuel Martínez
 * @author Mario Puente
 * @author Luis Montenegro
 *
 * SingletonException
 * Es lanzada cuando se tiene más de una clase del ADT con patrón de diseño Singleton
 */
public class SingletonException extends Exception {

	private static final long serialVersionUID = 1L;

	SingletonException(){
		super();
	}
	
	SingletonException(String message) {
		super(message);
	}
}
