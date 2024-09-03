package testpackage;

import java.util.Iterator;
import java.util.Vector;

public class VectorImpl {

	public static void main(String[] args) {
		Vector<Integer> Vector = new Vector<Integer>();
		// Appends the specified element to the end of this Vector.
		Vector.add(10);
		Vector.add(20);
		Vector.add(30);
		Vector.add(40);
		Vector.add(50);
		Vector.add(20);

		for (Integer i : Vector) {
			System.out.println(i);
		}
		System.out.println("--------------------------------------------------------------");
		//Returns the number of components in this vector.
		System.out.println(Vector.size());
		System.out.println("--------------------------------------------------------------");
		// Removes all of the elements from this Vector.
		Vector.clear();
		for (Integer i : Vector) {
			System.out.println(i);
		}
		
		// Tests if this vector has no components.
		System.out.println("Vector is Empty=" + Vector.isEmpty());
		System.out.println("----------------------------------------------------------");

		Vector<Integer> Vector1 = new Vector<Integer>();
		Vector1.add(100);
		Vector1.add(200);
		Vector1.add(300);
		Vector1.add(400);
		Vector1.add(500);
		Vector1.add(400);		
		// Appends all of the elements in the specified Collection to the end of this vector
		Vector.addAll(Vector1);

		for (Integer i : Vector) {
			System.out.println(i);
		}
		System.out.println("--------------------------------------------------------------");
		
		//Returns the element at the specified position in this Vector.
		System.out.println(Vector.get(0));
		System.out.println(Vector1.get(2));
		System.out.println("--------------------------------------------------------------");
		
		// Returns the element at the specified position in this Vector.
		System.out.println(Vector.remove(3));
		System.out.println("--------------------------------------------------------------");
		
		// Returns true if this vector contains the specified element.
		System.out.println(Vector.contains(100));
		System.out.println("--------------------------------------------------------------");
		
		//Vector3 added
		Vector<Integer> Vector3 = new Vector<Integer>();

		Vector3.add(100);
		Vector3.add(200);
		// Removes from this Vector all of its elements that are contained in the
		// specified Collection.
		Vector.removeAll(Vector3);
		
		// ITERATOR-Returns an iterator over the elements in this list in proper
		// sequence
		// hasNext();-Returns true if the iteration has more elements
		// next();-Returns the next element in the iteration.
		Iterator<Integer> it = Vector.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
