package testpackage;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListImpl {

	public static void main(String[] args) {

		LinkedList<String> LinkedList=new LinkedList<String>();
		
		//Appends the specified element to the end of this list. 

		 LinkedList.add("Vedant");
		 LinkedList.add("Tarun");
		 LinkedList.add("Ovi");
		 LinkedList.add("Aditi");
		 LinkedList.add("Shlok");
		 
		 Iterator <String> it=LinkedList.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		 System.out.println("----------------------------------------------------------------");
		 
		 LinkedList<String> LinkedList1=new LinkedList<String>();
			
		 LinkedList1.add("BE");
		 LinkedList1.add("BCA");
		 LinkedList1.add("BA");
		 LinkedList1.add("Bcom");
		 LinkedList1.add("BE");
		 LinkedList1.add("Btech");
		 
		 //Appends all of the elements in the specified collection to the end ofthis list
		 LinkedList.addAll(LinkedList1);
		 Iterator <String> it1=LinkedList.iterator();
		 while(it1.hasNext()) {
			 System.out.println(it1.next());
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 System.out.println("----------------------------------------------------------------");
		 //Removes all of the elements from this list.The list will be empty after this call returns.
		 LinkedList1.clear();
		 for(String str:LinkedList1) {
			 System.out.println(str);
		 }
		 System.out.println("----------------------------------------------------------------");
		 //Returns true if this collection contains no elements. 
		 System.out.println("LinkedList is Empty="+LinkedList.isEmpty());
		 System.out.println("LinkedList1 is Empty="+LinkedList1.isEmpty());
		 
		 System.out.println("----------------------------------------------------------------");
		 
		 //Returns the element at the specified position in this list.
		 System.out.println(LinkedList.get(2));
		 System.out.println("----------------------------------------------------------------");
		 
		 //Returns true if this list contains the specified element
		 System.out.println(LinkedList.contains("Shlok"));
		 System.out.println("----------------------------------------------------------------");
		 
		 //Removes the element at the specified position in this list.
		 LinkedList.remove(1);
		 for(String str:LinkedList) {
			 System.out.println(str);
		 }
		 System.out.println("----------------------------------------------------------------");
		
		 //New LinkedList2 added
		 LinkedList<String> LinkedList2=new LinkedList<String>();
			
		 LinkedList2.add("BE");
		 LinkedList2.add("Ovi");
		 LinkedList2.add("BA");
		 //Removes all of this collection's elements that are also contained in thespecified collection (optional operation
		 LinkedList.removeAll(LinkedList2);
		 for(String str:LinkedList) {
			 System.out.println(str);
		 }
	
		 
		 
		 
		 
		
		 
		 
		 
		

	}

}
