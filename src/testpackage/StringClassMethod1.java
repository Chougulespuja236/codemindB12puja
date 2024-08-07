package testpackage;

public class StringClassMethod1 {

	public static void main(String[] args) {
		String s = "Hampi is the land of ruins and beauty ";

		// Converts all of the characters in this String to upper case
		System.out.println(s.toUpperCase());
		System.out.println(
				"----------------------------------------------------------------------------------------------");

		// Converts all of the characters in this String to lower case
		System.out.println(s.toLowerCase());
		System.out.println(
				"----------------------------------------------------------------------------------------------");

		// Returns a string resulting from replacing all occurrences of oldChar in this
		// string with newChar.
		System.out.println(s.replace('a', 'A'));
		System.out.println(
				"----------------------------------------------------------------------------------------------");

		// Replaces each substring of this string that matches the literal target
		// sequence with the specified literal replacement sequence.
		System.out.println(s.replace("Hampi", "Badami"));
		System.out.println(
				"----------------------------------------------------------------------------------------------");

		// Tests if this string starts with the specified prefix.
		System.out.println(s.startsWith("Hampi"));
		System.out.println(s.startsWith("ruins"));
		System.out.println(
				"----------------------------------------------------------------------------------------------");

		// Tests if this string ends with the specified suffix.
		System.out.println(s.endsWith("beauty"));
		System.out.println(s.endsWith("land"));
		System.out.println(
				"----------------------------------------------------------------------------------------------");

		// Returns a string that is a substring of this string
		System.out.println(s.substring(13));
		System.out.println(
				"----------------------------------------------------------------------------------------------");

		// Returns a string that is a substring of this string. The substring begins at
		// the specified beginIndex and extends to the character at index endIndex - 1.
		System.out.println(s.substring(31, 37));
		System.out.println(
				"----------------------------------------------------------------------------------------------");

		// Splits this string around matches of the given regular expression.
		String s2[] = s.split("a");
		for (int i = 0; i < s2.length; i++) {
			System.out.println(s2[i]);
		}
		System.out.println(
				"=================================================================================================================");

		String s1 = "      Timeless Beauty    ";

		// Returns a string whose value is this string, with any leading and trailing
		// whitespace removed.
		System.out.println(s1);
		System.out.println(s1.trim());
		System.out.println(
				"=================================================================================================================");

		String ss = "abch12564@#$%^&*AGHCKabs147**";

		// Replaces each substring of this string that matches the given regular
		// expression with the given replacement.
		System.out.println(ss.replaceAll("[0-9]", ""));
		System.out.println(ss.replaceAll("[A-Za-z0-9]", ""));
		System.out.println(ss.replaceAll("[^a-zA-Z0-9]", ""));
		System.out.println(ss.replaceAll("[^0-9]", ""));
		System.out.println(
				"----------------------------------------------------------------------------------------------");

		// Replaces the first substring of this string that matches the given regular
		// expression with the given replacement.
		System.out.println(ss.replaceFirst("[abch]", ""));
		System.out.println(
				"----------------------------------------------------------------------------------------------");

		// Returns the string representation of the char argument.
		String ss1 = String.valueOf("codemind");
		System.out.println(ss1.length());
		System.out.println(
				"----------------------------------------------------------------------------------------------");
		//Print first letter in words capital in given string
	    String S="welcome to goa";
	       
	       for (int i = 0; i < S.length(); i++) { 
	    	   if(i==0 && Character.isLowerCase(S.charAt(i))) {
	    		   System.out.print(Character.toUpperCase(S.charAt(i)));
	    		   continue;
	    	   }
	       if(i!=0 && S.charAt(i-1)==' ') {
	    	   System.out.print(Character.toUpperCase(S.charAt(i)));
	       }   
	       else {
	    	   System.out.print(S.charAt(i));}
	       }
		}   
		

	}


