package javapackages;


public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a[]= {"aditi","shivam","vedant","rahul","vidisha"};
		
		System.out.print(a[0] +"\t");
		System.out.print(a[1] +"\t");
		System.out.print(a[2] +"\t");
		System.out.print(a[3] +"\t");
		System.out.print(a[4] +"\t");
		
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
	}

}
