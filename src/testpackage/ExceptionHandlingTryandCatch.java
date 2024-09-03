package testpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandlingTryandCatch {

	public static void main(String[] args) {

		// file not found Exception handling using try and catch
		// checked exception

		File f = new File("C:\\Users\\Satish\\Desktop\\Manual");
		try {
			
			FileReader fr = new FileReader(f);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("Exception caught=" + "FileNotFoundException");
			
			try {
				FileInputStream FileInputStream = new FileInputStream(f);
			} catch (FileNotFoundException e1) {
				System.out.println(e.getMessage());
				System.out.println("Exception caught=" + "FileNotFoundException");
			}
			
		
		}

	}

}
