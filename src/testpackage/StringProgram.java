package testpackage;

public class StringProgram {

	public static void main(String[] args) {
		// Print string using char index
		String s = "Radha";
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i));
		}
		System.out.println();

		// print string in reverse direction
		for (int i = s.length() - 1; i >= 0; i--) {

			System.out.print(s.charAt(i));
		}
		System.out.println();

		// print count of character a given string
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				count = count + 1;
			}
		}
		System.out.println("count of character a = " + count);			
	}

}
