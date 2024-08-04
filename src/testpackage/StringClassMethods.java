package testpackage;

public class StringClassMethods {

	public static void main(String[] args) {
		// by using string literal
		String s="Welcome to karntaka";
		System.out.println(s);
		System.out.println("--------------------------------------------------------------------------------------------------");
		
		//using new keyword
		String s1=new String("codemind technology");
		System.out.println(s1);
		
		char c[]= {'P','U','N','E'};
		String s2=new String (c);
		System.out.println(s2);
		
		System.out.println("--------------------------------------------------------------------------------------------------");
					
				
		//String is Immutable
		String p="Rohit";
		String r="Rohit";
		
		System.out.println(p.concat(" Sharma"));
		
		System.out.println(p);		
		System.out.println(r);
		
		System.out.println("--------------------------------------------------------------------------------------------------");		

		
		// String class methods
	
		// 1.character value specified by index
		char s3 = s.charAt(5);
		System.out.println(s3);
		System.out.println(
				"--------------------------------------------------------------------------------------------------");

		// 2.Concatenates the specified string to the end of this string.
		String s4 = s.concat(" state");
		System.out.println(s4);
		System.out.println(
				"--------------------------------------------------------------------------------------------------");

		// 3.Returns true if and only if this string contains the specified sequence of
		// char values(true/false)
		System.out.println(s.contains("come"));
		System.out.println(
				"--------------------------------------------------------------------------------------------------");

		// 4. if this string ends with the specified suffix(True/False)
		System.out.println(s.endsWith("taka"));
		System.out.println(
				"--------------------------------------------------------------------------------------------------");

		// 5.Compares two strings lexicographically
		System.out.println(s.compareTo(s1));

		System.out.println(
				"--------------------------------------------------------------------------------------------------");

	}

}
