package seleniumConcepts;

import java.util.ArrayList;
import java.util.List;

public class CollectionConcepts {
	public static void main(String[] args) {
		List<Object> S = new ArrayList<Object>();
		S.add(10);
		S.add("sree");
		S.add('S');
		S.add(38.45);
		S.add(true);
		S.add(10);
		System.out.println(S);

		//to add the value in the list using index
		S.add(3,"bala");
		System.out.println(S);
		
		//to check whether the given sree is present or not.
		boolean B = S.contains("sree");
		System.out.println(B);
		
		//to retrieve a value
		Object M = S.get(3);
		System.out.println(M);
		
		int indexOf = S.indexOf('S');
		System.out.println(indexOf);
		
		//to get the index of particular value
	       int lastIndexOf = S.lastIndexOf(10);
	       System.out.println(lastIndexOf);
		
	       S.remove(3);
	       System.out.println(S);
	       
	       int size = S.size();
	       System.out.println(size);
	       
	       S.set(3, "abi");
	       System.out.println(S);
	       
	       S.clear();
	       System.out.println(S);
	       
		
	}

}
