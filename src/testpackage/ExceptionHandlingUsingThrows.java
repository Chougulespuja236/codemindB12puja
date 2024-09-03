package testpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandlingUsingThrows {

	public static void main(String[] args) {
		int p = 20;
		int q;

		try {
			q = p / 0;
		} catch (ArithmeticException e) {
			System.out.println("exception caught=" + e.getMessage() + " ArithmaticException");
		}
		ExceptionUsingThrows eh = new ExceptionUsingThrows();
		try {
			eh.read();
		} catch (FileNotFoundException e) {

			System.out.println("exception caught=" + "\n" + e.getMessage() + " FileNotFoundException");
		}

	}
}

class ExceptionUsingThrows {

	void Divide() throws ArithmeticException {
	}

	void read() throws FileNotFoundException {
		File f = new File("C:\\Users\\Satish\\Desktop\\Manual");
		FileReader fr = new FileReader(f);

	}
}
