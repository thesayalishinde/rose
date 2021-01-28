package operators;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuOps {
	static int add, sub, mul, div, mod, x, y;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("");
		System.out.println("Enter the two numbers to perform operations ");
		System.out.println("");

		System.out.print("Enter the first number : ");
		try {
			x = s.nextInt();
		} catch (InputMismatchException a) {
			System.out.println("Enter Proper Interger Value  ");
		}
		System.out.println("Enter the second number : ");
		try {
			y = s.nextInt();
		} catch (InputMismatchException a) {
			System.out.println("Enter Proper Interger Value ");
		}

		char choice;
		do {
			System.out.println("....Menu for Operations....");
			System.out.println("A. For Arithmatic Operations \n Please Enter one operator +, -, *, /, % ");
			System.out.println("B. For String Concatenation enter B ");
			System.out.println("C. For Comparison enter C");
			System.out.println("D. For Unary operations enter D ");
			System.out.println("E. For Bitwise operations \n Please Enter one operator |, &, ^ ");
			System.out.println("F. Exit: ");
			choice = s.next().charAt(0);

			add = x + y;
			sub = x - y;
			mul = x * y;
			div = x / y;
			mod = x % y;

			if (choice == '+')
				System.out.println(x + "+" + y + "=" + add);
			if (choice == '-')
				System.out.println(x + "-" + y + "=" + sub);
			if (choice == '*')
				System.out.println(x + "*" + y + "=" + mul);
			if (choice == '/')
				System.out.println(x + "/" + y + "=" + div);
			if (choice == '%')
				System.out.println(x + "%" + y + "=" + mod);

			if (choice == 'B') {

				System.out.println("");
				System.out.println("Enter the two Strings to concat ");
				System.out.println("");
				System.out.println("Enter the first String : ");
				String firstString = s.next();
				System.out.println("Enter the second String : ");
				String secondString = s.next();
				String thirdString = firstString + secondString;
				System.out.println(thirdString);
			}
			if (choice == 'C') {
				if (x == y)
					System.out.println(x + " == " + y);
				if (x != y)
					System.out.println(x + " != " + y);
				if (x > y)
					System.out.println(x + " > " + y);
				if (x < y)
					System.out.println(x + " < " + y);
				if (x <= y)
					System.out.println(x + " <= " + y);
			}
			if (choice == 'D') {
				System.out.println("\n Please Enter one operator --, ++");
				String u = s.next();
				if (u == "--") {
					// x--;
					// y--;
					System.out.println("Decremented values are " + x-- + " " + y--);
				}
				if (u == "++") {
					x++;
					y++;
					System.out.println("incremented values are " + x + " " + y);
				}

			}

			if (choice == '|')
				System.out.println("x|y = " + (x | y));

			if (choice == '&')
				System.out.println("x&y = " + (x & y));

			if (choice == '^')
				System.out.println("x^y = " + (x ^ y));

			else
				System.out.println("Please enter proper input from the menu ");

		} while (choice != 'F');
		s.close();
	}

}
