package Test;

class Flower {

	void colour() {
		System.out.println("Flowers have different colours ");
	}

//private protected
	void petals() {
		System.out.println("Flowers have Petals ");
	}
}

class Rose extends Flower {
	void colour() {
		System.out.println(" Rose is red ");
	}

	void petals() {
		System.out.println("Rose has many Petals ");
	}

}

public class ExampleOver {
	public static void main(int args) {
		System.out.println("Main method of Rose is executed.");
	}

	public static void main(String[] args) {

		main(1);
		Flower f = new Flower();
		f.colour();
		f.petals();

		Flower f2 = new Rose();
		f2.colour();
		f2.petals();
	}
}
