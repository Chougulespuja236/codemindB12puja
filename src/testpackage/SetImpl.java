package testpackage;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class SetImpl {
	
	public static void main(String[] args) {
		Set<Integer> Set = new HashSet<Integer>();
		Set.add(null);
		Set.add(15);
		Set.add(20);
		Set.add(450);
		Set.add(450);
		// print Set using for each loop
		for (Integer i9 : Set) {
			// System.out.println(i);
		} // print Set using for loop
		for (int i = 0; i < Set.size(); i++) {
			// System.out.println(Set.get(i));
		}
		// print Set using Iterator
		Iterator<Integer> it = Set.iterator();
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
				Set.clear();
				for (Integer i : Set) {
					System.out.println(i);
				}
				System.out.println("------------------------------------------------------------------------------------------------------------");
				// Returns true if this list contains no elements.
				System.out.println(Set.isEmpty());
				System.out.println("------------------------------------------------------------------------------------------------------------");
		        
				//new Set1 added
				Set<Integer> Set1 = new HashSet<Integer>();
				Set1.add(null);
				Set1.add(900);
				Set1.add(250);
				Set1.add(40);
				Set1.add(10);
				// Appends all of the elements in the specified collection to the end of this list
				Set.addAll(Set1);
				for (Integer i1 : Set) {
					System.out.println(i1);
				}
				System.out.println("------------------------------------------------------------------------------------------------------------");

				// Removes the element at the specified position in this list
				Set.remove(10);
				for (Integer i1 : Set) {
					System.out.println(i1);
				}
				System.out.println("------------------------------------------------------------------------------------------------------------");
				
				// Returns the number of elements in this list.
				System.out.println(Set.size());
				System.out.println("------------------------------------------------------------------------------------------------------------");
				
				// Returns true if this list contains the specified element
				System.out.println(Set.contains(null));
				System.out.println("------------------------------------------------------------------------------------------------------------");
				
				//new Set2 added
				Set<Integer> Set2 = new HashSet<Integer>();
				Set2.add(null);
				Set2.add(900);
				
				// Removes from this list all of its elements that are contained in the specified collection.
				Set.removeAll(Set2);
				Iterator<Integer> i3 = Set.iterator();
				while (i3.hasNext()) {
					System.out.println(i3.next());
				}

			}
		
	}


