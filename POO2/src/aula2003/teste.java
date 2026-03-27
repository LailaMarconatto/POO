package aula2003;
import java.util.*;

// escreva metodo generico que conte numero de elementos em um array T que sejam maiores que um elemento E, onde T e E são iguais
public class teste <T,E> {
	private T[] type;
	private E element;
	
	public teste(T[] type, E element) {
		super();
		this.type = type;
		this.element = element;
	}
	
	public T[] getType() {
		return type;
	}
	public void setType(T[] type) {
		this.type = type;
	}
	
	public E getElement() {
		return element;
	}
	public void setElement(E element) {
		this.element = element;
	}
	
	
}
