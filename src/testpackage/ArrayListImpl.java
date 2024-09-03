package testpackage;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListImpl {

	public static void main(String[] args) {
		ArrayList<Integer> ArrayList = new ArrayList<Integer>();
		ArrayList.add(null);
		ArrayList.add(15);
		ArrayList.add(25);
		ArrayList.add(450);
		ArrayList.add(500);
		// print ArrayList using for each loop
		for (Integer i : ArrayList) {
			// System.out.println(i);
		} // print ArrayList using for loop
		for (int i = 0; i < ArrayList.size(); i++) {
			// System.out.println(ArrayList.get(i));
		}
		// print ArrayList using Iterator
		Iterator<Integer> it = ArrayList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(
				"---------------------------------------------------------------------------------------------------------");
		// Returns the element at the specified position in this list.
		System.out.println(ArrayList.get(1));
		System.out.println(
				"---------------------------------------------------------------------------------------------------------");
		//

		// Removes all of the elements from this list. The list willbe empty after this
		// call returns.
		ArrayList.clear();
		for (Integer i : ArrayList) {
			System.out.println(i);
		}
		System.out.println("------------------------------------------------------------------------------------------------------------");
		// Returns true if this list contains no elements.
		System.out.println(ArrayList.isEmpty());
		System.out.println("------------------------------------------------------------------------------------------------------------");
        
		//new ArrayList1 added
		ArrayList<Integer> ArrayList1 = new ArrayList<Integer>();
		ArrayList1.add(null);
		ArrayList1.add(900);
		ArrayList1.add(250);
		ArrayList1.add(40);
		ArrayList1.add(10);
		// Appends all of the elements in the specified collection to the end of this list
		ArrayList.addAll(ArrayList1);
		for (Integer i1 : ArrayList) {
			System.out.println(i1);
		}
		System.out.println("------------------------------------------------------------------------------------------------------------");

		// Removes the element at the specified position in this list
		ArrayList.remove(3);
		for (Integer i1 : ArrayList) {
			System.out.println(i1);
		}
		System.out.println("------------------------------------------------------------------------------------------------------------");
		
		// Returns the number of elements in this list.
		System.out.println(ArrayList.size());
		System.out.println("------------------------------------------------------------------------------------------------------------");
		
		// Returns true if this list contains the specified element
		System.out.println(ArrayList.contains(null));
		System.out.println("------------------------------------------------------------------------------------------------------------");
		
		//new ArrayList2 added
		ArrayList<Integer> ArrayList2 = new ArrayList<Integer>();
		ArrayList2.add(null);
		ArrayList2.add(900);
		
		// Removes from this list all of its elements that are contained in the specified collection.
		ArrayList.removeAll(ArrayList2);
		Iterator<Integer> i3 = ArrayList.iterator();
		while (i3.hasNext()) {
			System.out.println(i3.next());
		}

	}

}
