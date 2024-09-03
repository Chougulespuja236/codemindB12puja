package testpackage;

public class InterfaceExample {

	public static void main(String[] args) {
		studentclass s1 = new studentclass();
		s1.totalmarks();
		s1.study();
		s1.play();
	}
}

interface Student {
	// instance member variable
	String name = "aditya";
	int physicsmarks = 85;
	int chemistrymarks = 75;
	int biologymarks = 90;

	// instance method
	public void totalmarks();

	public abstract void study();

	void play();

}
class studentclass implements Student {

	public void totalmarks() {
		int totalmarks = physicsmarks + chemistrymarks + biologymarks;
		System.out.println("aditya got totalmarks=" + totalmarks);
	}

	public void study() {
		System.out.println("aditya is studing");
	}

	@Override
	public void play() {
		System.out.println("aditya is playing football");

	}
}