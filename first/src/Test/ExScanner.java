package Test;

//import java.util.Scanner;

class Alpha {

	Alpha printData() {
		return new Alpha();
	}
}

class Beta extends Alpha {

	Beta printData() {
		return new Beta(); // return type is a subtype of declared return type-covariant return
	}
}

public class ExScanner {

	public static void main(String[] args) {
/*		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer ");

		int a = sc.nextInt();
		System.out.println("Entered integer is: " + a);

		System.out.println("Enter name");

		String Name = sc.nextLine();
		System.out.println("name is: " + Name);
*/
		Beta b = new Beta();
		b.printData();
		
	}

}
