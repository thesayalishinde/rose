package Test;

class Bag extends ExConsOv {
	Bag(int b, String name) {
		super(b, name);
		System.out.println("inside 2 parameterized constructor of ExConsOv ");
	}
}

public class ExConsOv {
	int b;
	String name;

	public ExConsOv() {
		System.out.println("inside feww");
	}

	public ExConsOv(int b) {
		super();
		System.out.println("The value is" + b);
		this.b = b;
	}

	public ExConsOv(int b, String name) {
		super();
		System.out.println("The value is " + b);
		System.out.println("The name is " + name);
		this.b = b;
		this.name = name;
	}

	public static void main(String[] args) {
		Bag b = new Bag(101, "saya");
	}
}
