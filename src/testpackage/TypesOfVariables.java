package testpackage;

public class TypesOfVariables {

	public static void main(String[] args) {
		System.out.println(Variables.c);
		System.out.println(Variables.PAN_NO);
		Variables V=new Variables();
		System.out.println(V.a);
		System.out.println(V.d);
		V.test();
		V.add();
	}

}

class Variables{
	//instance member variables
	int a=10;
	public float b=20.3f;
	
	//static member variable
	public static int c=25;
	
	
	//final variable
	public final int d=40;
	public static final String PAN_NO="CHGPJ6565K";
	
	//local variable
	public void test() {
		
		final int f = 10+20;
		System.out.println(f);
	}
	public void add() {
		int dd=a+c;
		System.out.println(dd);
		
	}
	
}