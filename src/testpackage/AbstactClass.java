package testpackage;

public class AbstactClass {

	public static void main(String[] args) {
		calculation calculation = new calculation();
		calculation.addition();
		calculation.substration();
		calculation.multiplication();
		calculation.division();
	}
}
abstract class Arithmaeticoperation {

	// instance member variable
	int a = 75;
	int b = 20;

	// instance member function
	public void addition() {
		System.out.println(a + b);
	}

	abstract void substration();

	public void multiplication() {
		System.out.println(a * b);
	}

	abstract void division();
}

class calculation extends Arithmaeticoperation {
	@Override
	void substration() {
		System.out.println(a - b);
	}

	@Override
	void division() {
		System.out.println(a / b);

	}

}
