package testpackage;

public class FullyEncpsulatedMethod {

	public static void main(String[] args) {
		// 
		Encapsulated E=new Encapsulated();
		E.setA(25);
		System.out.println(E.getA());
		E.setB(36);
		System.out.println(E.getB());
	
	}

}
class Encapsulated{
	private int a ;
	private int b;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	
	
	
}
