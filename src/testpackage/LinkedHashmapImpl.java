package testpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashmapImpl {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> Age = new LinkedHashMap<String, Integer>();

		Age.put("Ravi", 18);
		Age.put("ved", 10);
		Age.put("Shreyas", 12);
		Age.put("Rudra", 25);
		Age.put("Shivank", 20);
		Age.put("Shridhar", 18);
		Age.put("Anvika", 15);
		Age.put(null, 12);

		Set<Entry<String, Integer>> s = Age.entrySet();
		Iterator<Entry<String, Integer>> it = s.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("---------------------------------------------------------------------");
		LinkedHashMap<String, Integer> Age1 = new LinkedHashMap<String, Integer>();
		Age1.put("Madhuri", 28);
		Age1.put("Sada", 30);
		Age1.putAll(Age);

		Set<Entry<String, Integer>> s1 = Age1.entrySet();
		for (Entry<String, Integer> e : s1) {
			System.out.println(e);
		}
		System.out.println("----------------------------------------------------------------------");
		Age.clear();
		System.out.println("Age LinkedHashmap is Empty=" + Age.isEmpty());
		System.out.println("Age LinkedHashmap is Empty=" + Age1.isEmpty());
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Age LinkedHashmap is Contains key Ravi=" + Age.containsKey("Ravi"));
		System.out.println("Age1 LinkedHashmap is contains key madhuri=" + Age1.containsKey("Madhuri"));
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("size of linkedhashmap Age is=" + Age.size());
		System.out.println("size of linkedhashmap Age1 is=" + Age1.size());
		System.out.println("--------------------------------------------------------------------------");

		System.out.println("Value of given key ved is=" + Age.get("Ved"));
		System.out.println("Value of given key sada is=" + Age1.get("Sada"));
		System.out.println("---------------------------------------------------------------------------");

		
	}

}
