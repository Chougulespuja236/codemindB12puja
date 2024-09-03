package testpackage;

import java.util.Iterator;
import java.util.HashSet;

public class HashSetImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

HashSet<String> HashSet=new HashSet<String>();
		
		//Appends the specified element to the end of this list. 

		 HashSet.add("null");
		 HashSet.add("samarth");
		 HashSet.add("sai");
		 HashSet.add("sakshi");
		 HashSet.add("Shree");
		 
		 Iterator <String> it=HashSet.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		 System.out.println("----------------------------------------------------------------");
		 
		 HashSet<String> HashSet1=new HashSet<String>();
			
		 HashSet1.add("blue");
		 HashSet1.add("red");
		 HashSet1.add("green");
		 HashSet1.add("green");
		 HashSet1.add("yellow");
		 HashSet1.add("violet");
		 
		 //Appends all of the elements in the specified collection to the end ofthis list
		 HashSet.addAll(HashSet1);
		 Iterator <String> it1=HashSet.iterator();
		 while(it1.hasNext()) {
			 System.out.println(it1.next());
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 System.out.println("----------------------------------------------------------------");
		 //Removes all of the elements from this list.The list will be empty after this call returns.
		 HashSet1.clear();
		 for(String str:HashSet1) {
			 System.out.println(str);
		 }
		 System.out.println("----------------------------------------------------------------");
		 //Returns true if this collection contains no elements. 
		 System.out.println("HashSet is Empty="+HashSet.isEmpty());
		 System.out.println("HashSet1 is Empty="+HashSet1.isEmpty());
		 
		 System.out.println("----------------------------------------------------------------");
		 
		
		 //Returns true if this list contains the specified element
		 System.out.println(HashSet.contains("Shlok"));
		 System.out.println("----------------------------------------------------------------");
		 
		 //Removes the element at the specified position in this list.
		 HashSet.remove("Bcom");
		 for(String str:HashSet) {
			 System.out.println(str);
		 }
		 System.out.println("----------------------------------------------------------------");
		
		 //New HashSet2 added
		 HashSet<String> HashSet2=new HashSet<String>();
			
		 HashSet2.add("red");
		 HashSet2.add("shree");
		 HashSet2.add("blue");
		 //Removes all of this collection's elements that are also contained in thespecified collection (optional operation
		 HashSet.removeAll(HashSet2);
		 for(String str:HashSet) {
			 System.out.println(str);
		 }
	
		 
		 
		 
		 
		
		 
		 
		 
		

	}

}
