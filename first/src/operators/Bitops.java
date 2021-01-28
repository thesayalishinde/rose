package operators;

import java.util.Scanner;

public class Bitops {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("");
		System.out.println("Enter the two numbers to perform operations ");
		System.out.println("");
		System.out.print("Enter the first number : ");
		int x = s.nextInt();
		System.out.print("Enter the second number : ");
		int y = s.nextInt();

		s.close();

		System.out.println("x&y = " + (x & y));
		System.out.println("x|y = " + (x | y));
		System.out.println("x^y = " + (x ^ y));
		System.out.println("~x = " + ~x);
		System.out.println("x >> 1 = " + (x>>1));
		System.out.println("x << 2 = " + (x<<2));
		x &= y;
		System.out.println("x= " + x);
		
		
		int i = 10;
		int n = i++%5;
		System.out.println(i);
		System.out.println(n);
		
	}

}
