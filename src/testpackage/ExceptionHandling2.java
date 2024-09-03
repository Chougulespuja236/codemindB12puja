package testpackage;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		String s = null;
		// s.toUpperCase();

		String s1 = "Welcome to codemind";
		// s1.charAt(65);

		int a[] = { 10, 20, 30 };
		// System.out.println(a[20]);

		String s2 = "axnh%%";
		// int i=Integer.parseInt(s2);

		int b=10/0;
		System.out.println(b);

		try {
			s.toUpperCase();
			s1.charAt(65);
			System.out.println(a[20]);
			int i = Integer.parseInt(s2);

		} catch (NullPointerException e) {
			System.out.println("ExceptionCaught=" + "NullPointerException");
			s = "aditi";
			System.out.println(s);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ExceptionCaught=" + "ArrayIndexOutOfBoundsException");
			System.out.println("check lengh of array a");

		} catch (NumberFormatException e) {
			System.out.println("ExceptionCaught=" + "NumberFormateException");
			System.out.println("String s2 character must be numeric");

		}  catch (Exception e) {
			int firstnum = 25;
			int secondnum = 36;
			if (firstnum > secondnum) {
				System.out.println("firstnum is greater than secondnum");
			}
		}finally {
			System.out.println("All possible Exceptions are handled using try and catch");
		}

	}
}
