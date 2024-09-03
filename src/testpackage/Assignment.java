package testpackage;

public class Assignment {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			if (i == 2 || i == 4 || i == 6 || i == 8 || i == 9) {
				continue;
			}

			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------------------------------------------------------------------");
		
		//Print first letter in words capital in given string and covert remaining all characters in lower case
		
		String S = "weLcome to codEmind tecHnoLogy";
		
		for (int i = 0; i < S.length(); i++) {
			if (i == 0 && Character.isLowerCase(S.charAt(i))) {
				System.out.print(Character.toUpperCase(S.charAt(i)));
				continue;
			}

			if (i != 0 && S.charAt(i - 1) == ' ') {
				System.out.print(Character.toUpperCase(S.charAt(i)));
				continue;
			}
			if (i != 0 && Character.isUpperCase(S.charAt(i))) {
				System.out.print(Character.toLowerCase(S.charAt(i)));
				continue;
			}

			else {
				System.out.print(S.charAt(i));
			}
		}
	}

}
