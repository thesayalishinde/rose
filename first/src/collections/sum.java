package collections;

import java.util.Scanner;

class Animal {}
class Dog extends Animal{}

public class sum {
	static int add, sub, mul, div, mod;
		public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("");
		System.out.println("Enter the two numbers to perform operations ");
		System.out.println("");
		System.out.print("Enter the first number : ");
		int x = s.nextInt();
		System.out.print("Enter the second number : ");
		int y = s.nextInt();
		
		add = x + y;
		System.out.println(x + "+" + y + "=" + add);

		sub = x - y;
		System.out.println(x + "-" + y + "=" + sub);

		mul = x * y;
		System.out.println(x + "*" + y + "=" + mul);

		div = x / y;
		System.out.println(x + "/" + y + "=" + div);

		mod = x % y;
		System.out.println(x + "%" + y + "=" + mod);

		s.close();
		
		
		}
}
