package org.mapconcept;

public class MapClass2 {
	public static void main(String[] args) {
		String S = "welcome God God here here here";
		String[] split = S.split(" ");
		
		  for (int i = 0; i < split.length; i++){
			  System.out.println(split[i]);
		  }
		  
		 // "or"
		  
		for (String word : split) {
			System.out.println(word);
		}
	}

}
