package testpackage;

public class StringProgrames {

	public static void main(String[] args) {
		// Print given string
		String s = "welcome to codemind";
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		System.out.println("-------------------------------------------------------------------------");
		// reverse the string
		for (int i = s.length() - 1; i > 0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		System.out.println("-------------------------------------------------------------------------");

		// check given string is palendrom or not
		String s1 = "Beautiful";
		String s2 = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			s2 = s2 + s1.charAt(i);
		}
		if (s1.equals(s2)) {
			System.out.println(s1 + "\n" + "given string is palendron=" + s2);
		} else {
			System.out.println(s1 + "\n" + "given string is not palendron=" + s2);
		}

		System.out.println("-----------------------------------------------------------------------------------------------------------");

		// check number of words in given string
		// String s="welcome to codemind";
		String a[] = s.split(" ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.print("number of words ingiven string is=" + a.length);

		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------------------");

		// find number of characters
		// String s="welcome to codemind";
		int count = 0;
		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) == 'd') {
				count++;
			}
		System.out.println("count of 'd' in given string is=" + count);
		System.out.println("-----------------------------------------------------------------------------------------------------------");

		// Print first letter in words capital in given string
		String S = "welcome to goa";

		for (int i = 0; i < S.length(); i++) {
			if (i == 0 && Character.isLowerCase(S.charAt(i))) {
				System.out.print(Character.toUpperCase(S.charAt(i)));
				continue;
			}
			if (i != 0 && S.charAt(i - 1) == ' ') {
				System.out.print(Character.toUpperCase(S.charAt(i)));
			} else {
				System.out.print(S.charAt(i));
			}
		}
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------------------------");

		// print lower case character to upper case and upper case to lower case
		String S1 = "Good Morning";

		for (int i = 0; i < S1.length(); i++) {
			if (Character.isLowerCase(S1.charAt(i))) {
				System.out.print(Character.toUpperCase(S1.charAt(i)));
			} else {
				System.out.print(Character.toLowerCase(S1.charAt(i)));
			}
		}

	}
}
