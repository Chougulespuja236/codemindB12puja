package testpackage;

public class TernaryOperator {

	public static void main(String[] args) {
		//ternary operator
    TernaryOperator TO = new TernaryOperator();
    System.out.println("1.eligible for voting=" + TO.eligibleforvoting(17,"india"));
    System.out.println("2.eligible for voting=" + TO.eligibleforvoting(20,"india"));
    System.out.println("3.eligible for voting=" + TO.eligibleforvoting(21,"US"));
		

	}
	
	public boolean eligibleforvoting(float age,String country) {
	 boolean eligibleforvoting;
	
	 eligibleforvoting = age >=18 && country.equals("india")? true :false;
	 
	 return eligibleforvoting;
	}
	}
	
	

