package testpackage;

public class ExceptionHandling {

	public static void main(String[] args) {
		// unchecked exception
		// arithmetic exception using try and catch
		int a = 10;
		int b;

		try {
			b = a / 0;

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		System.out.println("unchecked Exception handling using try and catch");
	}

}
