package org.mapconcept;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapClass4 {

	public static void main(String[] args) {
		
		 String S = " Welcome to Java";
		    Map<Character, Integer> D = new HashMap<Character, Integer>();
		    char[] arr = S.toCharArray();
		    for (char value: arr) {

		       if (Character.isAlphabetic(value)) {
		           if (D.containsKey(value)) {
		               D.put(value, D.get(value) + 1);

		           } else {
		               D.put(value, 1);
		           }
		       }
		    }

		    System.out.println(D);
		    Set<Entry<Character, Integer>> G = D.entrySet();
		    for (Entry<Character, Integer> V : G) {
		    	if(V.getValue()>1){
		    	System.out.println(V);

			}
				
			}
	}

}
