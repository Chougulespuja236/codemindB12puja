package testpackage;

public class ArraysProgram {

	public static void main(String[] args) {
		// Single dimensional array
		System.out.println("//Single dimensional array");
		
		int a[]= {11,22,33,44,55,66};
		
		System.out.print(a[0] +"\t");
		System.out.print(a[1] +"\t");
		System.out.print(a[2] +"\t");
		System.out.print(a[3] +"\t");
		System.out.print(a[4] +"\t");
		System.out.print(a[5] +"\t");

		System.out.println();
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		System.out.println("lengh of single dimensional array is="+a.length);
        
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		System.out.println("print single dimensional array value using for loop");
		int i;
	   for(i=0; i<=a.length-1; i++) {
		   System.out.print(a[i]+"\t");
		   
		  
	   }
	   System.out.println();
	   System.out.println("==============================================================================================================================");
	   	   
	   //multidimensional array
	   System.out.println("//multidimensional array");
	   
	   int b[][]= {{50,100,150},{40,80,120},{30,60,90},{10,20,70}};
	   	       
	       System.out.println(b[1][0]+"\t");
	       System.out.println(b[2][1]+"\t");
	       System.out.println(b[1][2]+"\t"); 
	       System.out.println(b[0][2]+"\t");
 System.out.println("------------------------------------------------------------------------------------------------------------------------");

            System.out.println("lengh of multidimensional array of row is="+b.length);
			System.out.println("lengh of multidimensional array of column is="+b[0].length);
	        
System.out.println("------------------------------------------------------------------------------------------------------------------------");
			System.out.println("print multi dimensional array value using for loop");
					
		   for(int j=0; j<b.length; j++) {
			   for(int k=0; k< b[j].length; k++) {
				   System.out.print(b[j][k]+"\t");
			   }
		    System.out.println();
		   }			  			   
	}	
	}


