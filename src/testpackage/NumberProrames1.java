package testpackage;

public class NumberProrames1 {

	public static void main(String[] args) {
		//Palindromic number program
				System.out.println("------------------------------------------------------------------");
				System.out.println("");
				int num=202;
				int copy_num=202;
				int add=0;
				int reminder;
				while(num>0) {
					reminder=num%10;
					add=(add*10)+reminder;
					num=num/10;
				}
				if(copy_num==add) {
					System.out.println("given number is palindrome number="+copy_num);
				}else {
					System.out.println("given number is not palindrome number="+copy_num);
				}
				
System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
					//armstrong number;	
				int num1=526;
				int copy_num1=156;
				int sum=0;
				int rem;
				while(num1>0) {
					rem=num1%10;
					sum=sum+(rem*rem*rem);
					num1=num1/10;
				}
				if(copy_num1==sum) {
					System.out.println("given number is armstronge number="+copy_num1);
				}else {
					System.out.println("given number is not armstronge number="+copy_num1);
				}
					
				

	}

}
