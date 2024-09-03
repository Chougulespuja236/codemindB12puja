package testpackage;

public class ExceptionhandlingUsingThrow {

	public static void main(String[] args) {
		String s = "aditi";

		try {
			s = null;
			throw new NullPointerException();

		} catch (NullPointerException e) {
			System.out.println("exception caught=" + e.getMessage() + " NullPointerException");
		}

	}

}
