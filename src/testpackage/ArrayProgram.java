package testpackage;

public class ArrayProgram {

	public static void main(String[] args) {
		// print array
				int a[][] = { { 10, 20, 30 }, { 30, 50, 60 }, { 70, 30, 90 } };
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						System.out.print(a[i][j] + "\t");
					}
					System.out.println();

				}
				// print count of number 30 in given array
				int count = 0;
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {

						if (a[i][j] == 30) {
							count = count + 1;

						}
					}

				}
				System.out.print("count of number 30 is=" + count);
				System.out.println();
		      
				//print sum of given diagonal elements
				int sum=0;
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
							sum = a[0][0]+a[1][1]+a[2][2];
							
						}
					}
				System.out.println("sum of diagonal elements =" + sum);
			}


	}

