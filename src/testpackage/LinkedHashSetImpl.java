package testpackage;

import java.util.LinkedHashSet;
import java.util.Iterator;


public class LinkedHashSetImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> LinkedHashSet = new LinkedHashSet<Integer>();
		LinkedHashSet.add(null);
		LinkedHashSet.add(456);
		LinkedHashSet.add(758);
		LinkedHashSet.add(100);
		LinkedHashSet.add(100);
		// print LinkedHashSet using for each loop
		for (Integer i9 : LinkedHashSet) {
			// System.out.println(i);
		} // print LinkedHashSet using for loop
		for (int i = 0; i < LinkedHashSet.size(); i++) {
			// System.out.println(LinkedHashSet.get(i));
		}
		// print LinkedHashSet using Iterator
		Iterator<Integer> it = LinkedHashSet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(
				"---------------------------------------------------------------------------------------------------------");
		System.out.println(
				"---------------------------------------------------------------------------------------------------------");
		//
		
		// Removes all of the elements from this list. The list willbe empty after this
				// call returns.
				LinkedHashSet.clear();
				for (Integer i : LinkedHashSet) {
					System.out.println(i);
				}
				System.out.println("------------------------------------------------------------------------------------------------------------");
				// Returns true if this list contains no elements.
				System.out.println(LinkedHashSet.isEmpty());
				System.out.println("------------------------------------------------------------------------------------------------------------");
		        
				//new LinkedHashSet1 added
				LinkedHashSet<Integer> LinkedHashSet1 = new LinkedHashSet<Integer>();
				LinkedHashSet1.add(906);
				LinkedHashSet1.add(101);
				LinkedHashSet1.add(202);
				LinkedHashSet1.add(309);
				LinkedHashSet1.add(402);
				// Appends all of the elements in the specified collection to the end of this list
				LinkedHashSet.addAll(LinkedHashSet1);
				for (Integer i1 : LinkedHashSet) {
					System.out.println(i1);
				}
				System.out.println("------------------------------------------------------------------------------------------------------------");

				// Removes the element at the specified position in this list
				LinkedHashSet.remove(10);
				for (Integer i1 : LinkedHashSet) {
					System.out.println(i1);
				}
				System.out.println("------------------------------------------------------------------------------------------------------------");
				
				// Returns the number of elements in this list.
				System.out.println(LinkedHashSet.size());
				System.out.println("------------------------------------------------------------------------------------------------------------");
				
				// Returns true if this list contains the specified element
				System.out.println(LinkedHashSet.contains(null));
				System.out.println("------------------------------------------------------------------------------------------------------------");
				
				//new LinkedHashSet2 added
				LinkedHashSet<Integer> LinkedHashSet2 = new LinkedHashSet<Integer>();
				LinkedHashSet2.add(101);
				LinkedHashSet2.add(202);
				
				// Removes from this list all of its elements that are contained in the specified collection.
				LinkedHashSet.removeAll(LinkedHashSet2);
				Iterator<Integer> i3 = LinkedHashSet.iterator();
				while (i3.hasNext()) {
					System.out.println(i3.next());
				}

			}
		
	}


