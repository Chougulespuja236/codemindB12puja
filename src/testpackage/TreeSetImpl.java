package testpackage;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetImpl {

	public static void main(String[] args) {
		TreeSet<Integer> TreeSet=new TreeSet<Integer>();
		
		TreeSet.add(1100);
		TreeSet.add(1000);
		TreeSet.add(990);
		TreeSet.add(880);
		TreeSet.add(770);
		TreeSet.add(1000);
		
		Iterator<Integer> it=TreeSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-------------------------------------");
		System.out.println(TreeSet.size());
		System.out.println("-------------------------------------");
		System.out.println(TreeSet.isEmpty());
		System.out.println("-------------------------------------");
		TreeSet.clear();
		for(Integer i:TreeSet) {
			System.out.println(i);
		}
		System.out.println("-------------------------------------");
		
        TreeSet<Integer> TreeSet1=new TreeSet<Integer>();
		
		TreeSet1.add(111);
		TreeSet1.add(222);
		TreeSet1.add(999);
		TreeSet1.add(333);
		TreeSet1.add(444);
		TreeSet1.add(777);
		
		TreeSet.addAll(TreeSet1);
		TreeSet.remove(111);
		Iterator<Integer> it1=TreeSet.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		System.out.println("-------------------------------------");
		
		
		System.out.println(TreeSet.contains(100));
		
		System.out.println("-------------------------------------");
        TreeSet<Integer> TreeSet2=new TreeSet<Integer>();
		
		TreeSet2.add(333);
		TreeSet2.add(222);
		TreeSet.removeAll(TreeSet2);
		Iterator<Integer> it2=TreeSet.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}

	}

}
