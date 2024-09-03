package testpackage;

public class SuperKeywordUse {

	public static void main(String[] args) {
		SuperChild SuperChild = new SuperChild();
		SuperChild.add();

	}

}

class SuperParent {
	int a = 95;

	public void add() {
		System.out.println(a);
	}

	SuperParent() {
		System.out.println("SuperParent constructor");
	}
}

class SuperChild extends SuperParent {
	int a = 56;

	public void add() {
		System.out.println(super.a + a);
	}

	SuperChild() {
		super();
		System.out.println("SuperChild constructor");
	}
}
