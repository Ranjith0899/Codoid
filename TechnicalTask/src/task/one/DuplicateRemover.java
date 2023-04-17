package task.one;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class DuplicateRemover {
	  public static <T> void removeDuplicates(ArrayList<T> list) {
	        LinkedHashSet<T> unique = new LinkedHashSet<>(list);
	        list.clear();
	        list.addAll(unique);
	    }
	  public static void main(String[] args) {
		ArrayList<Integer> i = new ArrayList<Integer>();
		i.add(1);
		i.add(2);
		i.add(3);
		i.add(2);
		i.add(1);
		ArrayList<String> s = new ArrayList<String>();
		s.add("Hello");
		s.add("Hola");
		s.add("Hai");
		s.add("Hola");
		s.add("Hello");
		System.out.println(" Actual Array List "+i);
		removeDuplicates(i);
		System.out.println("Array List after duplicate removel "+i);
		System.out.println(" Actual Array List "+s);
		removeDuplicates(s);
		System.out.println("Array List after duplicate removel "+s);
	}
}
