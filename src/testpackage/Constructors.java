package testpackage;

public class Constructors {
    
	//default constructor
	public static void main(String[] args) {
		employee E = new employee();
		System.out.println(E.name+"  "+E.empID+"  "+E.role);
		
	}
}
  class employee {
	
	 //instance member variables
	 String name;
	 int empID;
	 String role;
	 
	 //instance members functions
	 public void work() {
		 System.out.println("employee is working");
	 }
	 public void discuss() {
		 System.out.println("emplyees are discussing");
	 }
	 
	 
	 
 }
 

