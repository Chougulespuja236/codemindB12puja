package testpackage;

public class StringMethods {

	public static void main(String[] args) {

		String s = "Welcome to Hampi";

		// Compares two strings lexicographically, ignoring case differences
		System.out.println(s.compareToIgnoreCase("Welcome to Pune"));

		// Compares this string to the specified object
		System.out.println(s.equals("Welcome to Hampi"));
		System.out.println(s.equals("welcome to hampi"));
		System.out.println(s.equals("good morning"));

		// Compares this String to another String, ignoring case considerations
		System.out.println(s.equalsIgnoreCase("welcome to hampi"));
		System.out.println(s.equalsIgnoreCase("Good Morning"));

		// Returns the index within this string of the first occurrence ofthe specified
		// character
		System.out.println(s.indexOf('H'));
		System.out.println(s.indexOf('e'));

		// Returns the index within this string of the first occurrence of the specified
		// substring.
		System.out.println(s.indexOf("to"));
		System.out.println(s.indexOf("come"));

		// Returns the index within this string of the first occurrence of the specified
		// character, starting the search at the specified index.
		System.out.println(s.indexOf('e', 2));
		System.out.println(s.indexOf('o', 0));

		// Returns the index within this string of the first occurrence of the specified
		// substring, starting at the specified index
		System.out.println(s.indexOf("come", 0));
		System.out.println(s.indexOf("Hampi", 3));

		// Returns the index within this string of the last occurrence of the specified
		// character
		System.out.println(s.lastIndexOf('e'));
		System.out.println(s.lastIndexOf('o'));

		String ss = "Welcome to Hampi & Welcome to Karntaka";

		// Returns the index within this string of the last occurrence of the specified
		// substring.
		// The last occurrence of the empty string ""is considered to occur at the index
		// value this.length().
		System.out.println(ss.lastIndexOf("to"));
		System.out.println(ss.lastIndexOf("Welcome"));

		// Returns the index within this string of the last occurrence of the specified
		// substring, searching backward starting at the specified index.
		System.out.println(ss.lastIndexOf('o', 35));

		// Returns the index within this string of the last occurrence of the specified
		// substring, searching backward starting at the specified index
		System.out.println(ss.lastIndexOf("Wel", 36));

		// Returns the length of this string
		System.out.println(ss.length());

		// Returns a hash code for this string
		System.out.println(s.hashCode());

		// Returns true if, and only if, length() is 0.
		System.out.println(s.isEmpty());
		System.out.println("".isEmpty());

	}

}
