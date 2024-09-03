package testpackage;

import java.util.Iterator;
import java.util.Stack;

public class StackImpl {

	public static void main(String[] args) {
		//
		Stack<String> Stack = new Stack<String>();

		// Appends the specified element to the end of this Vector.
		Stack.add("Engineer");
		Stack.add("Doctor");
		Stack.add("Teacher");
		Stack.add("Geologist");
		Stack.add("Pharmacist");
		Stack.add("Engineer");
		for (int i = 0; i < Stack.size(); i++) {
			System.out.println(i);
		}
		System.out.println("-------------------------------------------");

		// Returns the number of components in this vector.
		System.out.println(Stack.size());
		System.out.println("-------------------------------------------");

		// Removes all of the elements from this Vector
		Stack.clear();
		for (String str : Stack) {
			System.out.println(str);
		}
		System.out.println("-------------------------------------------");

		// Tests if this vector has no components.
		System.out.println("Stack is Empty=" + Stack.isEmpty());
		System.out.println("-------------------------------------------");

		Stack<String> Stack1 = new Stack<String>();

		
		
		
		
		
		
		
		// Appends the specified element to the end of this Vector.
		Stack1.add("avinash");
		Stack1.add("vinayk");
		Stack1.add("ganesh");
		Stack1.add("suraj");
		Stack1.add("saket");
		Stack1.add("shridha");
		// Appends all of the elements in the specified Collection to the end ofthis
		// Vector
		Stack.addAll(Stack1);
		for (String str : Stack) {
			System.out.println(str);
		}
		// Returns the element at the specified position in this Vector.
		System.out.println(Stack.get(2));
		System.out.println("-------------------------------------------");

		// Returns true if this vector contains the specified element
		System.out.println(Stack1.contains("shrida"));
		System.out.println("-------------------------------------------");

		//Removes the first occurrence of the specified element in this Vector
		System.out.println(Stack1.remove("vinayak"));
		System.out.println("-------------------------------------------");

		Stack<String> Stack3 = new Stack<String>();

		// Appends the specified element to the end of this Vector.
		Stack3.add("avinash");
		Stack3.add("vinayk");

		// Removes from this Vector all of its elements that are contained in the
		// specified Collection.
		Stack.removeAll(Stack3);

		// ITERATOR-Returns an iterator over the elements in this list in proper
		// sequence
		// hasNext();-Returns true if the iteration has more elements
		// next();-Returns the next element in the iteration.
		Iterator<String> it = Stack.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
