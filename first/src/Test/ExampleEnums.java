package Test;

public class ExampleEnums {
	enum Flowers {
		ROSE("red"), JASMINE("white"), LILY("pink");

		public String colour;

		// Creating a constructor just like in a class
		Flowers(String c) {
			colour = c;
		}

		public String getColour() {
			return colour;
		}
	}

	public static void main(String[] args) {
		// access enum constants or can declare variable using Flowers

		Flowers red = Flowers.ROSE;
		System.out.println(red);
		
		System.out.print("The colour of rose is " +Flowers.ROSE.colour);
		
		Flowers f = Flowers.ROSE;
	    System.out.println("\n"+f.getColour());

		Flowers allFlowers[] = Flowers.values();
		int i;
		Flowers x;
		for (i = 0; i < allFlowers.length; i++) {

			// accessing each element of array
			x = allFlowers[i];
			System.out.print(x + "\n");	
		}
		
		
	}
}
