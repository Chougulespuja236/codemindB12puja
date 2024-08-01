package testpackage;

public class ArrayProgram1 {

	public static void main(String[] args) {
		int a[] = { 7, 15, 2, 86, 14, 985, 200 };
		// print numbers in ascending orders
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp;
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("print Numbers in ascending orders:");
		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k] + "\t");
		}
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		// print numbers in array in descending orders
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp;
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("print Numbers in descending orders:");
		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k] + "\t");
		}
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		
		
		//print array length
		System.out.println("length of array is=" + a.length);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		
		
		// print largest and smallest number in given array
		System.out.println("Largest number in given array=" + a[0]);
		System.out.println("Smallest number in given array=" + a[a.length - 1]);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		
		
		// print Third largest and smallest number in given array
		System.out.println("Third Largest number in given array=" + a[2]);
		System.out.println("Third Smallest number in given array=" + a[a.length - 3]);
	}
}
