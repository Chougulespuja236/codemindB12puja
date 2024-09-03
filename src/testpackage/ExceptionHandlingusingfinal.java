package testpackage;

public class ExceptionHandlingusingfinal {

	public static void main(String[] args) {
		
		int x[] = { 10, 20, 30, 40 };
		int z;
		int n = 20;
		int m;
		try {
			z = x[10];
			System.out.println(z);
		} catch (Exception e) {
	
			System.out.println("exception caught=" + e.getMessage()+" ArrayIdexOutOfBoundException");
		}
		try {
			m = n / 0;
			System.out.println(m);
		} catch (Exception e) {
			
			System.out.println("exception caught=" + e.getMessage()+" ArithmaticException");
		}

		finally {
			System.out.println("final block executed");
		}

	}

}
