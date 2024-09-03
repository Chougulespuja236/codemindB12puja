package testpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapImpl {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(101, "Aradhya");
		map.put(102, null);
		map.put(109, "kishor");
		map.put(104, "Ketan");
		map.put(105, "Arushi");
		map.put(103, "samarth");
		map.put(null, "sai");
		map.put(107, null);

		Set<Entry<Integer, String>> s = map.entrySet();

		Iterator<Entry<Integer, String>> it = s.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			// Entry<Integer,String> E=it.next();
			// System.out.println(E.getKey()+" : "+E.getValue());
		}
		System.out.println("-----------------------------------------------------------------------------");

		Map<Integer, String> map1 = new HashMap<Integer, String>();

		map1.putAll(map);

		Set<Entry<Integer, String>> s1 = map1.entrySet();

		Iterator<Entry<Integer, String>> it1 = s1.iterator();

		while (it1.hasNext()) {
			System.out.println(it1.next());
			// Entry<Integer,String>E1=it1.next();
			// System.out.println(E1.getKey()+":"+E1.getValue());
		}

		System.out.println("--------------------------------------------------------------------------------");
		map.clear();
		System.out.println("map is empty=" + map.isEmpty());
		System.out.println("map1 is empty=" + map1.isEmpty());
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("map1 having key 106=" + map1.containsKey(106));
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("Size of map1 is=" + map1.size());
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("Value of given key 101 is=" + map1.get(101));
		System.out.println("Value of given key 107 is=" + map1.get(107));
		System.out.println("--------------------------------------------------------------------------------");

		Set<Integer> keyset = map1.keySet();

		Iterator<Integer> it3 = keyset.iterator();
		while (it3.hasNext()) {
			System.out.println(it3.next());
		}
		// for(Integer key:keyset) {
		// System.out.println(key);
		// }
		System.out.println("---------------------------------------------------------------------------------");
		Collection<String> values = map1.values();
		// Iterator<String> it4=values.iterator();
		// while(it4.hasNext()) {
		// System.out.println(it4.next());
		// }
		for (String value : values) {
			System.out.println(value);
		}
		System.out.println("-------------------------------------------------------------------------------");
		map1.remove(101);
		Set<Entry<Integer, String>> s2 = map1.entrySet();

		for (Entry<Integer, String> str : s2) {
			System.out.println(str);
		}
		System.out.println("--------------------------------------------------------------------------------");
		map1.replace(102, "Parikshit");
		Set<Entry<Integer, String>> s5 = map1.entrySet();
		for (Entry<Integer, String> str1 : s5) {
			System.out.println(str1);
		}

	}

}
