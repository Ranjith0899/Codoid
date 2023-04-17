package task.one;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateFinder {
    public static void main(String[] args){
	String s = "Array";
       // Converting string to lower case
       s.toLowerCase();
       // Spiting string into character array
	char[] split = s.toCharArray();
       // map for storing storing char and its number of duplicates in key and value pair
	Map< Character, Integer> m = new LinkedHashMap<Character, Integer>();
       // for each loop to iterate char[]
       for (char c : split) {
       if(c ==' '){ continue;}
       //checking whether the char already had a entry in the map and adding +1 if it has an entry with put method
	else if (m.containsKey(c)) {
	m.put(c, m.get(c)+1);}
       // else adding into map with put method with number of duplicate as 1
	else {
	m.put(c, 1);}
       }
      // for printing charter which occurs more than one time
      Set<Entry< Character, Integer>> entrySet = m.entrySet();
      for (Entry< Character, Integer> entry : entrySet) {
      if (entry.getValue()>1) {
      System.out.println(entry.getKey() + " is duplicated and occurs " +entry.getValue()+" times");
      }
      }}}