package aula2003;
import java.lang.Comparable;

public class testeUtil {
	public static <T extends Comparable<T>> int contar(T[] anArray, T  elem){
		int count = 0;
		
		for(T e : anArray) {
			if (e.compareTo(elem) > 0)
				count++;
		}
		
		return count;
	}
}
