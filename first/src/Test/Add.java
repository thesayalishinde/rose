package Test;

public class Add {

	int a, b;

	public int add(int a, int b) {

		int sum = a + b;
		return sum;
	}

	public double add(double a, double b) {

		double sum = a + b;
		return sum;
	}

	public double add(int a, double b) {

		double sum = a + b;
		return sum;
	}

	public double add(float a, double b) {

		double sum = a + b;
		return sum;
	}
	
	public static void main(String[] args) {
		Add ob = new Add();
		int sum1 = ob.add(1, 5);
		System.out.println("sum of the two integer value :" + sum1);
		
		double sum2 = ob.add(1.0, 2.0);
		System.out.println("sum of the two double value :" + sum2);

		double sum3 = ob.add(4, 2.5);
		System.out.println("sum of the int and double value :" + sum3);
		
		double sum4 = ob.add(-3.6, 2.5);
		System.out.println("sum of the int and double value :" + sum4);
	}

}
