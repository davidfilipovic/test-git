package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;




public class NewMain {
	
	
	final int u = 0;
	
	
	
	private enum G{
		
		
	}
	
	static final Map<String, Object> mapT = new HashMap<>(); 
	
	public static void main(String[] args) {	
		
		mapT.put("key", 2);
		mapT.put("key", 33);
		mapT.put("key", 331);
		
		NewMain nm = new NewMain();
		System.out.println(nm.mapT);
		
		
		System.out.println(mapT.values());
		
		final int u = 9;
		
		TreeSet<String> set = new TreeSet<>();
		
		set.add("G");
		set.add("A");
		set.add("A");
		set.add("A");
		set.add("A");
		set.add("B");
		
System.out.println(set);		
		
		HashSet<String> list = new HashSet<>();
		list.add("ocrates");
		list.add("xlato");
		list.add("aebes");
		list.add("cebes");
		list.add("cebes");


		System.out.println(list);
//		
	}

}
