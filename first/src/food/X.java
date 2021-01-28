package food;

public class X extends Vegetable {
	
	static int a;

        int increment(){
		return ++a;
	}
	
	@Override
	public void getData() {
		System.out.println("Tomato");
		
	}
	public int sumOfTwo(int num1, int num2){
		return num1+num2;
	   }
	
	public static void main(String[] args) {
		X x = new X();
		X y = new X();
		//System.out.println(x.sumOfTwo(3,4));
		System.out.println("Default value is "+a);
		System.out.println("Incremented value is " +x.increment());
		System.out.println("Incremented value is " +y.increment());
	}

}
