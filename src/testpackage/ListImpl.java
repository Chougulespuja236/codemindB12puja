package testpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ListImpl {

	public static void main(String[] args) {
		// Iterator ArrayList1=new ArrayList();
		// Collection ArrayList=new ArrayList<>();
		
		ArrayList<Integer> ArrayList = new ArrayList<>(); 
		
		ArrayList<String> ArrayList1 = new ArrayList<>();
		
		ArrayList<Character> ArrayList2 = new ArrayList<>();
		
		FinalKeyword f = new FinalKeyword();

		ArrayList.add(10);
		ArrayList.add(30);
		ArrayList1.add("abc");
		ArrayList.add(70);
		ArrayList.add(10);
		ArrayList2.add('f');
		ArrayList<Student_1> A = new ArrayList<>();
		
		A.add(new Student_1());
		
		System.out.println(A.get(0).StudentID);
		System.out.println(A.get(0).StudentName);

	}
}

class Student_1 {
	int StudentID = 101;
	String StudentName = "Bhagyashree";

}