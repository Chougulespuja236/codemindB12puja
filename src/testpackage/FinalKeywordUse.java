package testpackage;

public class FinalKeywordUse {
	final int a = 20;
	final float PI = 3.14F;
	final double ADHARNO = 1000000256;
	final String BankName = "ICICI Bank";
	int b = 100;

	public static void main(String[] args) {
		FinalKeyword f = new FinalKeyword();
		System.out.println(f.a);
		System.out.println(f.PI);
		System.out.println(f.ADHARNO);
		System.out.println(f.BankName);
		System.out.println(f.b);
		f.addition();
		f.taxdeduction();
	}
	public void addition() {
		b = 200;
		System.out.println(b);
	}
	public final void taxdeduction() {
		
		System.out.println("tax deduction is fixed");
	}	
}
final class FinalKeyword extends FinalKeywordUse{
	
	public void addition() {		
		System.out.println(200+200);
	}	
}


