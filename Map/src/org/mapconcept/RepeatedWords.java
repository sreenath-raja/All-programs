package org.mapconcept;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatedWords {
	public static void main(String[] args) {
		String S = "welcome god god here here here";
		Map<String, Integer> m = new LinkedHashMap<String, Integer>();
		String[] allwords = S.split(" ");
		for (String words : allwords) {
			if (m.containsKey(words)) {
				Integer value = m.get(words);
				m.put(words, value+1);
				
			} else {
				m.put(words, 1);

			}
			//System.out.println(m);
			
		}
		Set<Entry<String, Integer>> AllEntry = m.entrySet();
		for (Entry<String, Integer> entry : AllEntry) {
			if (entry.getValue()>0) {
				System.out.println(entry);
			}
			
		}
	}
}
