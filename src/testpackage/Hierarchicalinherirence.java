package testpackage;

public class Hierarchicalinherirence {

	public static void main(String[] args) {
		// Hierarchical inheritance
		TataNexon N = new TataNexon();
		System.out.println(N.CompanyName);
		System.out.println(N.ComapnyType);
		System.out.println(N.ProductName);
		System.out.println(N.Engine);
		System.out.println(N.Transmission);
		System.out.println(N.Price);
		System.out.println(N.Colour);
		System.out.println("---------------------------------------------------------------------------");
		TataPunch P=new TataPunch();
		System.out.println(P.CompanyName);
		System.out.println(P.Products);
		System.out.println(P.ProductName);
		System.out.println(P.Engine);
		System.out.println(P.Transmission);
		System.out.println(P.Price);
		System.out.println(P.Colour);	}}
class TATAMotors{
	String CompanyName = "TataMotors";
	String ComapnyType = "Manual/Atomatic";
	String Products = "Car/Truck/Bus";
	// Behaviour
	public void run() {
		System.out.println("vehicle is running");
	}
	public void stand() {
		System.out.println("vehicle is standing");
	}		}
class TataNexon extends TATAMotors {
	String ProductName = "Tata Nexon";
	String Engine = "1497cc";
	String Transmission = "Atomatic";
	String Price = "15Lakhs";
	String Colour = "Blue";	
}
class TataPunch extends TATAMotors {
	String ProductName = "Tata Punch";
	String Engine = "1199cc";
	String Transmission = "Manual";
	String Price = "10Lakhs";
	String Colour = "White";
	int NoofWheels = 4;
}