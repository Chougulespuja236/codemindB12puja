package testpackage;

public class LoopStatement {

	public static void main(String[] args) {
		// for loop
		
		//print number 1 to 100
		int i;
		for(i=1;i<=100;i++) {
			System.out.println(i);
		}
		
		System.out.println("-----------------------------------------------------------------------------------------------------");
		
		//print numbers 100 to 1
		int j;
		for(j=100;j>=1;j--) {
			System.out.println(j);
		}		
	
	System.out.println("-----------------------------------------------------------------------------------------------------");
		
	//while loop statement
	        int a=2;
			int b=1;
		
			while(b<=10) {
				int c= a*b;
				System.out.println(a+ " * " + b+ " = " +c);
				b++;
			}
			System.out.println("-----------------------------------------------------------------------------------------------------");
			
			int d=3;
			int f=1;
			while(f<=10) {
				int e=d*f;
				System.out.println(d+ " * " + f+ " = " +e);
				f++;
				
			}						
            System.out.println("-----------------------------------------------------------------------------------");
			
            // multiplication table from 2 to 5 using if statement            
            System.out.println("Multiplication table from 2 to 10 using if statement");
           
            for(int X=2; X<=5; X++) {
            	for(int Y=1; Y<=10; Y++) {
            	System.out.print(X * Y + "\t");                       
            }          
            System.out.println("\n");           
         }                 
 System.out.println("-----------------------------------------------------------------------------------");
			
            // multiplication table from 2 to 5 using while statement            
            System.out.println("Multiplication table from 2 to 15 using while statement");
           int num1=2;
           while(num1<=5) {
        	   int num2=1;
        		while(num2<=10) {
        		
        			System.out.print(num1*num2 +"\t");
        			num2++;
        		}
        		num1++;
        		System.out.println("\n");
           }           
System.out.println("----------------------------------------------------------------------------------------------------------------");
			
			//febonacci series program
			System.out.println("fibonacci series upto 10 counts");
			int firstnum=0;
			int secondnum=1;
					int v;
					int nextnum;
			for(v=1;v<=10;v++)	{
				nextnum=firstnum+secondnum;
				firstnum=secondnum;
				secondnum=nextnum;
				System.out.print(firstnum + "\t");				
			}           
			System.out.println("");			 
			} 					
	}

			

	
	

