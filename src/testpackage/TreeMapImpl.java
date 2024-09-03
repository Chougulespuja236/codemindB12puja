package testpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapImpl {

	public static void main(String[] args) {
		TreeMap<Integer, String> Employee= new TreeMap<Integer, String>();
		Employee.put(1, "soniya");
		Employee.put(2, null);
		Employee.put(3, "umiksha");
		Employee.put(4, "gourish");
		Employee.put(9, "manas");
		Employee.put(6, "saurabh");
		Employee.put(7, "prathmesh");
		Employee.put(8, null);

		Set<Entry<Integer, String>> s = Employee.entrySet();

		Iterator<Entry<Integer, String>> it = s.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-----------------------------------------------------------------------------");

		Map<Integer, String> Employee1 = new HashMap<Integer, String>();
		Employee1.put(9, "ganesh");
		Employee1.put(10, "durgesh");
		Employee1.put(11, "tanvi");		
		Employee1.putAll(Employee);

		Set<Entry<Integer, String>> s1 = Employee1.entrySet();
		Iterator<Entry<Integer, String>> it1 = s1.iterator();

		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
		System.out.println("--------------------------------------------------------------------------------");				
		Employee.clear();
		System.out.println("Employee is empty=" + Employee.isEmpty());
		System.out.println("Employee1 is empty=" + Employee1.isEmpty());
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("Employee1 having key 106=" + Employee1.containsKey(106));
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("Size of Employee1 is=" + Employee1.size());
		System.out.println("Size of Employee1 is=" + Employee.size());
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("Value of given key 1 is=" + Employee1.get(1));
		System.out.println("Value of given key 7 is=" + Employee1.get(7));
		System.out.println("--------------------------------------------------------------------------------");

		Set<Integer> keyset = Employee1.keySet();

		Iterator<Integer> it3 = keyset.iterator();
		while (it3.hasNext()) {
			System.out.println(it3.next());
		}
		// for(Integer key:keyset) {
		// System.out.println(key);
		// }
		System.out.println("---------------------------------------------------------------------------------");
		Collection<String> values = Employee1.values();
		// Iterator<String> it4=values.iterator();
		// while(it4.hasNext()) {
		// System.out.println(it4.next());
		// }
		for (String value : values) {
			System.out.println(value);
		}
		System.out.println("-------------------------------------------------------------------------------");
		Employee1.remove(9);
		Set<Entry<Integer, String>> s2 = Employee1.entrySet();

		for (Entry<Integer, String> str : s2) {
			System.out.println(str);
		}
		System.out.println("--------------------------------------------------------------------------------");
		Employee1.replace(2, "sameer");
		Set<Entry<Integer, String>> s5 = Employee1.entrySet();
		for (Entry<Integer, String> str1 : s5) {
			System.out.println(str1);
		}

	}

}
	
