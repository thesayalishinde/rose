package operators;

import java.util.Scanner;

public class Aau {

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

		System.out.println("");
		System.out.println("Enter the two Strings to concat ");
		System.out.println("");
		System.out.println("Enter the first String : ");
		String firstString = s.next();
		System.out.println("Enter the second String : ");
		String secondString = s.next();
		String thirdString = firstString + secondString;
		System.out.println(thirdString);

		
		int num = 1;
		
		num = +1;
        System.out.println(num);

        num += 1;
        System.out.println(num);
        
        num -= 1;
        System.out.println(num);
        
                        
        num++;
        System.out.println(num);

        ++num;
        System.out.println(num);
        
        num++;
        System.out.println(num);
        
        num = -num;
        System.out.println(num);

        boolean success = false;
        System.out.println(success);
        System.out.println(!success);
    
	
		
		s.close();
	}

}
