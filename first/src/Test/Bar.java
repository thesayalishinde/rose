package Test;

class Bar extends Feww {
	// int a;

	/*public Bar(int b) {
		super(b);
		System.out.println("inside 1 parameterized constructor of Feww");
		// this.a = a;
	}
*/
	Bar(int b, String name) {
		super(b, name);
		System.out.println("inside 2 parameterized constructor of Feww");
	}

	public Bar() {
		this(5,"hey");
		System.out.println("inside default Cons.");
	}

	public static void main(String[] args) {
		Bar b = new Bar();
		//Bar b = new Bar(101, "sayali");
		// System.out.println(b.a + "---" + b.b);

	}
}
