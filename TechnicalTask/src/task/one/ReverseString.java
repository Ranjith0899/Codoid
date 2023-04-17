package task.one;

public class ReverseString {
	public static void main(String[] args) {
	  // Using loop
	 String s = "ranjith";
	 System.out.println("Actual String : "+ s);
	 String rev = "";
	   // reversing the String
	   for(int i = s.length()-1; i>=0; i--){
	     rev = rev +  Character.toString(s.charAt(i));
	   }
	   // assigning the reversed string to actual string
	   s = rev;
	   System.out.println("String after using loop to reverse : "+s);

	 // Using StringBuilder
	  String word = "hello";
	  System.out.println("Actual String : "+ word);
	  // using reverse method from StringBuilder
	  StringBuilder sb = new StringBuilder(word);
	  word =  sb.reverse().toString();
	   System.out.println("String after using reverse method from StringBuilder : "+word);

	 
	 //  similarly by StringBuffer
	  String st = "hola";
	  System.out.println("Actual String : "+ st);

	  StringBuffer sbf = new StringBuffer(st);
	 st = sbf.reverse().toString();
	   System.out.println("String after using reverse method from StringBuffer : "+st);

}}
