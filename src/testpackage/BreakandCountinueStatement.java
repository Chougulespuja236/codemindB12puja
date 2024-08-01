package testpackage;

public class BreakandCountinueStatement {

	public static void main(String[] args) {
		//break statement
		System.out.println("print numbers upto 15 and then break the loop");
		int number=1;
		while(true) {
			System.out.print(number+"\t");
			number++;
			if(number>15) {
				break;
			}		
		}
		System.out.print("end of the code");
System.out.println();	
System.out.println("------------------------------------------------------------------------------------------------------------");
	
		//print numbers which are completely divisible by 3
	for(int i=1;i<=20;i++) {
		
		if(i%3!=0) {
			continue;
		}else {
			System.out.println("number is divible by 3="+i);
		}
	}
	System.out.println("------------------------------------------------------------------------------------------------------------");
	
	//print 1 to 10 numbers but do not wanted to print numbers between 3 to 7
	
	System.out.println("Wanted to print 1-10 number but doesnt wanted to print numbers between 3 to 7");
	for(int j=1; j<=10; j++) {
			if(j>=3 && j<=7) {
				continue;
			}
		System.out.println(j);
		}	
	
	
	System.out.println("------------------------------------------------------------------------------------------------------------");
	System.out.println("continue odd number loops and print even number only");
	int a;
	for(a=1;a<=10;a++){
		if(a%2!=0) {
			continue;
		}
       System.out.println("Number is even="+a);
	}	
	
	
	
	
	
	
	
	
	
	
	}
}

