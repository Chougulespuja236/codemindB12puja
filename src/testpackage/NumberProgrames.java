package testpackage;

public class NumberProgrames {

	public static void main(String[] args) {
		//check number is prime or not
		NumberProgrames NP = new NumberProgrames();
		for(int j=1;j<=10;j++) {
			NP.testPrime(j);
		}	
		}
		public void testPrime(int number) {
			boolean prime=true;
			for(int i=2;i<=number/2;i++) {
				if(number%i!=0) {
					prime=false;				    
				}
			}
			if(prime) {
				System.out.println("Number is prime="+number);
			}else {
				System.out.println("Number is not prime="+number);
			}
					
		}
				
		}	

		


