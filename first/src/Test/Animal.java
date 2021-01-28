package Test;

public interface Animal {
	void feedingType();  
	void animalHabitat();
	String getColour();
	default void getName() {
		System.out.println("Hey Hey from Animal");
	}
	static void ppppp() {
		System.out.println("Hey Hey");
	}
}

