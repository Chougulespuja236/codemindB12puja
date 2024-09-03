package testpackage;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculate calculate=new calculate();
		calculate.addition();
		calculate.addition(25);
		calculate.addition(36, 99.63f);
		calculate.addition(10.20f);
		calculate.addition(99, 56, 30);
	
	}

	public void addition() {
		System.out.println("Without argument");
	}

	public void addition(int a) {
		System.out.println(a);
	}

	public void addition(int a, float b) {
		System.out.println(a + b);
	}

	void addition(float a) {
		System.out.println(a);
	}

	public int addition(int a, int b) {
		return a + b;

	}

}

class calculate extends MethodOverloading{
	public void addition(int a, int b,int c) {
		System.out.println(a+b+c);

	}

}




