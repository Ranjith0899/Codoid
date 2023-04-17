package task.one;

import java.util.LinkedList;
import java.util.List;

public class MethodOverloading {
	
	 public static void print(String s){
  	   System.out.println(s);
         }
	   public static void print(int i){
  	   System.out.println(i);
         }
	   public static void print(String[] sa ){
		  for (int i = 0; i < sa.length; i++) {
			System.out.println(sa[i]);
	          } 
	   }
	   public static void print(int[] ia ){
	          for (int i = 0; i < ia.length; i++) {
				System.out.println(ia[i]);
		  }
	   }
	   public static <T> void print(List<T> l ){
	           for (int i = 0; i < l.size(); i++) {
		        System.out.println(l.get(i));
		   }
         }

	   public static void main(String[] args) {
    	List<Integer> list = new LinkedList<Integer>();
		list.add(1);list.add(2);list.add(3);list.add(4);
		   
		print(2);
		print("hello");
		print(new int[] {1,2,3,4,5});
		print(new String[] {"Hai","Hello","Hola"});
		print(list);
	}
}
