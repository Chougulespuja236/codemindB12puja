package testpackage;

public class Multilevelinheritence {

	public static void main(String[] args) {
		// Multilevel Inheritance
		TATAPUNCH1 T = new TATAPUNCH1();
		System.out.println(T.CompanyName);
		System.out.println(T.ComapnyType);
		System.out.println(T.Pricerange);
		System.out.println(T.ProductName);
		System.out.println(T.Engine);
		System.out.println(T.Transmission);
		System.out.println(T.Price);
		T.stand();
		T.run();
	}
}
class Company {
	// properties
	String CompanyName = "TataMotors/Mahindra/KIA";
	String ComapnyType = "Manual/Atomatic";
	String Products = "Car/Truck/Bus";
	// Behaviour
	public void run() {
		System.out.println("vehicle is running");
	}
	public void stand() {
		System.out.println("vehicle is standing");
	}
}
class TataMotorsCOMPANY extends Company {
	String Company = "TATA Motors";
	String CarType = "Automatic";
	String Pricerange = "10Lakhs-20lakhs";
	String CompanyProduct = "Car";
}
class TATAPUNCH1 extends TataMotorsCOMPANY {
	String ProductName = "Tata Punch";
	String Engine = "1199cc";
	String Transmission = "Manual/Atomatic";
	String Price = "10Lakhs";
	String Colour = "White";
	int NoofWheels = 4;
}
