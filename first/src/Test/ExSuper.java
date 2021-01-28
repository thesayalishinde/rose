package Test;

class Flowers {

	int b;

	public Flowers(int b) {
		super();
		System.out.println("The no. of petals are " + b);
		this.b = b;
	}

	/*
	 * public Flowers() { System.out.println("inside Constructor of Flowers "); }
	 */

	void colour() {
		System.out.println("Flowers have different colours ");
	}

}

class Roses extends Flower {

	Roses(int b) {
		super();
	}

	void colour() {
		System.out.println(" Rose is red ");
	}

	void petals() {
		super.colour();

		System.out.println("Rose has many Petals ");
	}

}

public class ExSuper {

	public static void main(String[] args) {

		Flowers f = new Flowers(5);
		Roses r = new Roses(4);
		f.colour();
		r.petals();

	}

}
