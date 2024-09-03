package testpackage;

public class SingleLeveInheritence {

	public static void main(String[] args) {
		VehicleCompany v = new VehicleCompany();

		System.out.println(v.CompanyName);
		System.out.println(v.ComapnyType);
		System.out.println(v.Products);
		System.out.println(v.Company);
		System.out.println(v.CarType);
		System.out.println(v.Pricerange);
		System.out.println(v.CompanyProduct);
		v.stand();
		v.run();

	}

}

class Vehicle {
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

class VehicleCompany extends Vehicle {
	String Company = "TATA Motors";
	String CarType = "Automatic";
	String Pricerange = "10Lakhs-20lakhs";
	String CompanyProduct = "Car";
}
