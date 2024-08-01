package testpackage;

public class TernaryAssignmentoperator {

	public static void main(String[] args) {
		
		//assignment operator
		int a=50;
				System.out.println(a);
		
	    int b=85;
	    b+=10;    //b=b+10
	    System.out.println(b);
	    
	    b-=10;    //b=b-10
	    System.out.println(b);
	    
	    b*=10;    //b=b*10
	    System.out.println(b);
	  
	    b/=10;    //b=b/10
	    System.out.println(b);	

	    System.out.println("--------------------------------------------------------");
	   
	    //ternary operator
		int j=10;
		int k=30;
		int e;
		e=a>b?j:k;
		System.out.println(e);
		
		System.out.println("--------------------------------------------------------");
		
		//ternary operator with real time example
		
		float Age=19;
		String country="india";
		boolean eligibleforvoting;
		eligibleforvoting=  Age>18 && country.equals("india")?true:false;
		System.out.println("elegibleforvoting="+eligibleforvoting);
	}
	}

	
