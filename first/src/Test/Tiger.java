package Test;

public class Tiger implements Animal, KazInterfacce {

	String c;

	public Tiger(String c) {
		this.c = c;
	}

	public String getColour() {
		return c;
	}

	@Override
	public void feedingType() {
		System.out.println("Tiger is carnivore");
	}

	@Override
	public void animalHabitat() {
		System.out.println("tiger is terrestrial");

	}

	//@Override
	//public void getName() {
	//	KazInterfacce.super.getName();
	//}

	 public void getName() {
	 System.out.println("Hey Hey from SuperClass");
	 }

	public static void main(String[] args) {
		Tiger t = new Tiger("Orange");
		
		Animal.ppppp();
		t.feedingType();
		t.animalHabitat();
		System.out.println("tiger colour is " + t.getColour());

		Deer d = new Deer("Brown");
		
		d.feedingType();
		d.animalHabitat();
		System.out.println("Deer colour is " + d.getColour());

		t.getName();
		d.getName();
	}
}

class Deer extends Tiger implements Animal, KazInterfacce {

	public Deer(String c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	String s;

	// public Deer(String s) {
	// this.s = s;
	// }

	public String getColour() {
		return s;
	}

	public void feedingType() {
		System.out.println("Deer is herbivore");
	}

	@Override
	public void animalHabitat() {
		System.out.println("deer is terrestrial");

	}
}
