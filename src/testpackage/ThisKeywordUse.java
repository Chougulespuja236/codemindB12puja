package testpackage;

public class ThisKeywordUse {

	public static void main(String[] args) {
		ThisKeyword ThisKeyword = new ThisKeyword();
		ThisKeyword.add();

	}

}

class ThisKeyword {
	int a = 25;

	public void add() {
		int a = 70;
		System.out.println(this.a + a);
	
	}
	ThisKeyword(int num){
		this(25,36);
		System.out.println("single parameter  constructor");
	}
	ThisKeyword(int num1,int num2){
		System.out.println("two parameter constructor");
	}
	public ThisKeyword() {
		this(10);
		System.out.println("Default Constructor");
	}
	
	
	
	
}
