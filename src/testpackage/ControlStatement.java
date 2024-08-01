package testpackage;



public class ControlStatement {

	public static void main(String[] args) {
		
		// if statement
        int number=25;
        if(number>=0) {
        	System.out.println("number is positive="+number);
        }
        
        System.out.println("--------------------------------------------------------------------------"); 
        
       
        
        //if else statement
         char V= 'i';
     if(V == 'a' || V == 'e' || V=='i' || V == 'o' || V=='u' ){
      System.out.println("character is vowel V ="+ V);  	 
     }
     else {
    	 System.out.println("character is Consonant V ="+ V);  
     }
	 
     System.out.println("--------------------------------------------------------------------------"); 
     
    
     
		
     System.out.println("--------------------------------------------------------------------------");
     
     
     //if-else-if statement
     int experience=5;
     
     if(experience >0 && experience <= 1) {
    	 System.out.println("candidate is eligible for intern post");
     }
     else if(experience >=1 && experience <= 3){
    	 System.out.println("candidate is eligible for software engineer post");
     }
     else if(experience >=3 && experience <= 5){
    	 System.out.println("candidate is eligible for senior software engineer post");
     }
     else{
    	 System.out.println("candidate is not eligible for any post");
    
     }
 System.out.println("--------------------------------------------------------------------------"); 
     
    
     
     
     
     
     
     
     //nested if statement
     String student="aditya";
     String nationality="Indian";
     String subjects="PCB";
     int marks=50;
     
     if(nationality=="Indian") {
    	  
    	 if(subjects=="PCB") {
    		 
    		  if(marks>=50) {
    			      
    			      System.out.println("student is eligible for MBBS admission="+student);
    		 } 
    		  else {
    			 System.out.println("candidate marks is insufficient for MBBS admission");
    		 } 
    	 }
    	 else {
    			 System.out.println("candidate must have PCB subjects");
    		 } 
     } 
     else {
    			 System.out.println("candidate nationality must be indian");  	 
    	 }
    

     System.out.println("--------------------------------------------------------------------------------");
     
     
     
	//switch statement
	
	String state="Karnataka";
	switch (state) {
	case "Maharashtra":
		System.out.println("state is Maharashtra");
		break;
	case "Goa":
		System.out.println("state is Goa");
		break;
	case "Gujrat":
		System.out.println("state is Gujrat");
		break;	
	case "Haryana":
		System.out.println("state is Haryana");
		break;	
	default:
		System.out.println("sorry!state mensioned is invalid");
		break;
	}
			
	}	
	
	
	}	
	



     
     
     
     
     
     
     
   