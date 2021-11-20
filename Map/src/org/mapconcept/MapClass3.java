package org.mapconcept;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapClass3 {
	public static void main(String[] args) {
		String S = "Welcome god god here here here";
		Map<String, Integer> m = new LinkedHashMap<String, Integer>();
		String[] Allwords = S.split(" ");
		for (String sree : Allwords) {
			if (m.containsKey(sree)) {
				Integer value = m.get(sree);
				m.put(sree, value+1);
				
			}
			else {
				m.put(sree, 1);
			}
			
		}
		System.out.println(m);
	}

}
