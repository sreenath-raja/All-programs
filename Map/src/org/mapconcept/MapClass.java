package org.mapconcept;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapClass {
	public static void main(String[] args) {
		
		Map<Integer,String> m = new HashMap<Integer,String>();
		//Map<Object,ArrayList<Integer>> m = new HashMap<Object,ArrayList<Integer>>();)
		m.put(1, "c++");
		m.put(2, "java");
		m.put(3, "python");
		m.put(4, "R");
		m.put(4, "c#");
		System.out.println(m);
		
		Collection<String> values = m.values();
		System.out.println(values);
		
		Set<Integer> keySet = m.keySet();
		System.out.println(keySet);
	}
}
