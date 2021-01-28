package Test;

public class Feww {

	int b;
	String name;

	public Feww() {
		System.out.println("inside feww");
	}

	public Feww(int b) {
		super();
		System.out.println("The value is" + b);
		this.b = b;
	}

	public Feww(int b, String name) {
		super();
		System.out.println("The value is " + b);
		System.out.println("The name is " + name);
		this.b = b;
		this.name = name;
	}

}
