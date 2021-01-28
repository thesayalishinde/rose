package food;

public class Animal {
	String noise;

	public String getNoise() {
		return noise;
	}

	public void setNoise(String noise) {
		this.noise = noise;
	}

	public static void main(String[] args) {
		
		
		
		Animal a = new Animal();
		Animal ad = new Dog();
		a.setNoise("All animals");
		System.out.println("" + a.getNoise());
		ad.setNoise("Bark");
		System.out.println("A Dog :" + ad.getNoise());

		Dog d = new Dog();
		d.setNoise("bhaww");
		System.out.println("The dog " + d.getNoise());
		
		Dog dog = new Dog();
		Animal aa = (Animal)dog;
		((Dog) aa).colour();
		
		
		
	}

}

class Dog extends Animal {
	String colour;

	void colour() {
		System.out.println("Colour of Animal");
		
	}

	@Override
	public String getNoise() {
		// TODO Auto-generated method stub
		return super.getNoise();
	}

	@Override
	public void setNoise(String noise) {
		// TODO Auto-generated method stub
		super.setNoise(noise);
	}

}