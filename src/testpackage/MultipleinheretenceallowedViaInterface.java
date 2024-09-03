package testpackage;

public class MultipleinheretenceallowedViaInterface {

	public static void main(String[] args) {
		employees_1 E = new employees_1();
		E.work();
		E.test();
	}
}

interface employee1 {
	// data members
	String name = "vedant";
	public static final int employeesID = 101;

	// member function
	void work();
}

interface employee2 {
	// data members
	String name1 = "ayush";
	public static final int employeesID1 = 102;

	// member function
	void test();
}

interface employees extends employee1, employee2 {

}
class employees_1 implements employees {

	@Override
	public void work() {
		System.out.println(name + " " + "is working on development tool");
	}
	@Override
	public void test() {
		System.out.println(name1 + " " + "is testing application");
	}

}
